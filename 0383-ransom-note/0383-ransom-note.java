class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            int idx = c - 'a';
            if (count[idx] == 0) {
                return false;
            }
            count[idx]--;
        }

        return true;
    }
}
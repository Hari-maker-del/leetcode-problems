class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // First pass: count frequencies
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Second pass: find first char with count == 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
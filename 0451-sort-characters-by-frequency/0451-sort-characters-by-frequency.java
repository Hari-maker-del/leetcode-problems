import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((c1, c2) -> freq.get(c2) - freq.get(c1));

        StringBuilder result = new StringBuilder();  // declare result
        for (char c : chars) {
            int count = freq.get(c);                 // declare count
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
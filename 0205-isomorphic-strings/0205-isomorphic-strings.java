import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            // Check existing mapping from s to t
            if (mapST.containsKey(a)) {
                if (mapST.get(a) != b) {
                    return false;
                }
            } else {
                mapST.put(a, b);
            }

            // Check existing mapping from t to s
            if (mapTS.containsKey(b)) {
                if (mapTS.get(b) != a) {
                    return false;
                }
            } else {
                mapTS.put(b, a);
            }
        }

        return true;
    }
}
class Solution {
    public int maxDistance(String moves) {
        int cntL = 0, cntR = 0, cntU = 0, cntD = 0, cntBlank = 0;
        
        for (char c : moves.toCharArray()) {
            if (c == 'L') cntL++;
            else if (c == 'R') cntR++;
            else if (c == 'U') cntU++;
            else if (c == 'D') cntD++;
            else cntBlank++; // c == '_'
        }
        
        int x = cntR - cntL;
        int y = cntU - cntD;
        
        return Math.abs(x) + Math.abs(y) + cntBlank;
    }
}
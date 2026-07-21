class Solution {
    public int majorityElement(int[] a) {
        int c= 0;
        int count = 0;

        for (int b : a) {
            if (count == 0) {
                c = b;
                count = 1;
            } else if (b== c) {
                count++;
            } else {
                count--;
            }
        }

        return c;
    }
}
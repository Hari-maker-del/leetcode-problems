import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Min-heap of (frequency, number)
        PriorityQueue<int[]> minHeap =
            new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            minHeap.offer(new int[]{e.getValue(), e.getKey()});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        int i = 0;
        for (int[] pair : minHeap) {
            res[i++] = pair[1];
        }
        return res;
    }
}
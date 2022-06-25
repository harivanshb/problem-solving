class Solution {

    public int findKthLargest(int[] nums, int k) {
        return findLargest(nums,k);
    }

    private static int findLargest(int[] nums, int k) {
        int large = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            priorityQueue.add(num);
        }
        for (int j = 0; j < k; j++) {
            large = priorityQueue.remove();
        }
        return large;
    }
}

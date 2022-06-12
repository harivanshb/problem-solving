class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> values = new HashSet<Integer>();
        int start = 0, end = 0, runningsum = 0;
        int maxscore = -1;
        while (end < nums.length) {
            if (!values.contains(nums[end])) {
                runningsum = runningsum + nums[end];
                maxscore = Math.max(maxscore, runningsum);
                values.add(nums[end]);
                end++;
            } else {
                runningsum = runningsum - nums[start];
                values.remove(nums[start]);
                start++;
            }
        }
        return Math.max(maxscore, runningsum);
    }
}
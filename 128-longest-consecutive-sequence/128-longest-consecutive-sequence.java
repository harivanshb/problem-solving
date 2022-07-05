class Solution {

    public int longestConsecutive(int[] nums) {
       Set<Integer> numberSet = new HashSet<>();
      
      
        for (int i = 0; i < nums.length; i++) {
            numberSet.add(nums[i]);
        }
          int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentSeqLen = 1;
            if (!numberSet.contains(currentNum - 1)) {
                while (numberSet.contains(currentNum + 1)) {
                    currentNum+=1;
                    currentSeqLen+=1;
                }
                maxCount = Math.max(maxCount,currentSeqLen);
            }
        }
        return maxCount;
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       return findSmallestSub(nums,target);
    }
        private static int findSmallestSub(int[] arr, int k) {
        int windowStart=0;
        int windowEnd=0;
        int min = Integer.MAX_VALUE;
        int currentSum = 0;
        while(windowEnd<arr.length){
            currentSum+=arr[windowEnd];
            while(currentSum>=k){
                min = Math.min(min,(windowEnd-windowStart+1));
                currentSum-=arr[windowStart];
                windowStart++;
            } windowEnd++;
        }
        return min==Integer.MAX_VALUE? 0:min;
    }
}
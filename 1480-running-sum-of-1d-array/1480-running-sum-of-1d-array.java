class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum[]= new int [nums.length];
        int i,sum =0;
        for(i=0;i<nums.length;i++){
            runningSum[i]= nums[i]+sum;
            sum = runningSum[i];
        }
        return runningSum;
    }
}
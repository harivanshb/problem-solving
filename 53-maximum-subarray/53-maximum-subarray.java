class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int csum = 0;
        for(int i =0;i<nums.length;i++){
            if(csum<0)
                csum=0;
            csum+=nums[i];
            max= Math.max(max,csum);
        }
        return max;
    }
}
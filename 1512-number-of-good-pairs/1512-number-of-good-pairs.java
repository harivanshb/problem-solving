class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i,j;
        int goodPairs =0;
        for(i = 0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}
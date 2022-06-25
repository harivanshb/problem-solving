class Solution {

    public boolean checkPossibility(int[] nums) {
        int i, count = 0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1])
                continue;
            if(i==0||nums[i+1]>=nums[i-1]){
                nums[i] = nums[i+1];
                count+=1;
            }
            else{
                nums[i+1]=nums[i];
                count+=1;
            }
        }
        if(count>1){
            return false;
        } else return true;
    }
}

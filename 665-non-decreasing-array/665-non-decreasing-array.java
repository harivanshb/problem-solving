class Solution {

    public boolean checkPossibility(int[] nums) {
        int i;
        boolean changed = false;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1])
                continue;
            if(changed){
                return false;
            }
            if(i==0||nums[i+1]>=nums[i-1]){
                nums[i] = nums[i+1];
                changed=true;
            }
            else{
                nums[i+1]=nums[i];
                changed=true;
            }
        }
       return true;
    }
}

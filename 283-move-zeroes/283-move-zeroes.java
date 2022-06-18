class Solution {
    public void moveZeroes(int[] nums) {
        int end = 0;
        // while(end<nums.length){
        //     if(nums[start]==0 && nums[end]!=0){
        //         int temp = nums[start];
        //         nums[start] = nums[end];
        //         nums[end] = temp;
        //         start++;
        //     }
        //     end++;
        //     if(nums[start]!=0){
        //         start++;
        //     }
        // }
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[end];
                nums[end]= nums[i];
                nums[i] = temp;
                end ++;
            }
        }
    }
}
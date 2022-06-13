class Solution {
    public int maxProduct(int[] nums) {
        int end=0;
        int max = -1,temp=0;
        while(end<nums.length){
            if(nums[end]>max){
                temp=max;
                max = nums[end];
            }
            else {
                if(nums[end]>temp){
                temp =nums[end];
            }
            }
            end++;
        }
        return ((temp-1) * (max-1));
       
    }
    }
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2){
           return nums.length;
        }
        int count;
        int prev = nums[1]-nums[0]; 
        if(prev ==0){
            count =1;
        }else count =2;
        int diff;
        for(int i = 2; i<nums.length;i++){
            diff = nums[i]-nums[i-1];
            if(prev>=0&&diff<0 || prev<=0 && diff>0){
                count++;
                prev = diff;
            }
        }
        return count;
        
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1,i;
        
        while(start<=end){
            int mid = (start+(end))/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target>nums[mid]){
                start = mid+1;
            }
            else end = mid-1;
            
        }
        return -1;
    }
}
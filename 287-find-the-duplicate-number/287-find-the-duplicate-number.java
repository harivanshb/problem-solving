class Solution {
    public int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[correctIndex] != nums[i]){
                swap(nums, correctIndex, i);
            }
            else{
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1) return nums[i];
        }
        return -1;
    }
    
    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y] = temp;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];
        int i=0,j=nums.length-1,k=j;
        while(i<=j){
            if((nums[i]*nums[i])>=(nums[j]*nums[j])){
                newNums[k]=(nums[i]*nums[i]);
                k--;
                i++;
            }
            else{
                newNums[k] = (nums[j]*nums[j]);
                k--;
                j--;
            }
        }
        return newNums;
    }
}
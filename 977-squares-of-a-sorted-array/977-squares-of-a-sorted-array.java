class Solution {

    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, k=j;
        int[] newNums = new int[nums.length];
        while (i <= j) {
            int squareLeft = nums[i]*nums[i];
            int squareRight = nums[j]*nums[j];
            if (squareLeft>squareRight) {
                newNums[k] = squareLeft;
                k--;
                i++;
            } else {
                newNums[k] = squareRight;
                k--;
                j--;
            }
        }
        return newNums;
    }
}

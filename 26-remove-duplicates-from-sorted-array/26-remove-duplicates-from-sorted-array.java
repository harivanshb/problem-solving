class Solution {
    public int removeDuplicates(int[] nums) {
     int i, j = 1;
        for (i = 1; i < nums.length; i++) {
            if (nums[j - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] copy = new int[nums.length];
        int k=0;
        int startfirst = 0;
        int startsecond=n;
        while(startfirst<n &&startsecond<nums.length){
            copy[k]=nums[startfirst];
            copy[++k] = nums[startsecond];
            startfirst++;
            startsecond++;
            k++;
        }
        return copy;
    }
}
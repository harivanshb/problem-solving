class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j;
        for(j=m;j<nums1.length;j++){
            nums1[j] = nums2[i];
            i++;
        }
        int temp = nums1[0];
       Arrays.sort(nums1);
    }
}
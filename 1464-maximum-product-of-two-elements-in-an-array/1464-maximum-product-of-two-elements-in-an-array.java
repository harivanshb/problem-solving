class Solution {
    public int maxProduct(int[] nums) {
        int start =0, end,product =0;
        int max = -1;
        while(start<nums.length){
            end = start+1;
        while(end<nums.length){
                product = (nums[end] - 1) * (nums[start]-1);
                max = Math.max(max,product);
                end++;
            }
            start++;
        }
        return max;
        }
        
    }
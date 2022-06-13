class Solution {
    public int maxProduct(int[] nums) {
        int start =0, end=0,product =0;
        int max = -1,temp=0;
        while(end<nums.length){
            if(nums[end]>max){
                temp=max;
                max = Math.max(max,nums[end]);
            }
            else {
                if(nums[end]>temp){
                temp =nums[end];
            }
            }
            end++;
        }
        System.out.println(temp+"temp "+ "max"+max);
        return ((temp-1) * (max-1));
        // while(start<nums.length){
        //     end = start+1;
        // while(end<nums.length){
        //         product = (nums[end] - 1) * (nums[start]-1);
        //         max = Math.max(max,product);
        //         end++;
        //     }
        //     start++;
        // }
        // return max;
        // }
    }
    }
class Solution {
    public int minOperations(int[] nums, int x) {
        int k = -x;
        for(int i:nums){
            k=k+i;
        }
        if(k==0){
            return nums.length;
        }
        if(k<0) return -1;
        int start=0,end=0,sum=0,res=-1;
        for(end=0;end<nums.length;end++){
            sum=sum+nums[end];
            while(sum>k){
                sum = sum - nums[start];
                start++;
            }
            if(sum==k){
                res = Math.max(res,end-start+1);
            }
        }
        if(res<0){
            return -1;
        }
        return nums.length-res;
    }
}
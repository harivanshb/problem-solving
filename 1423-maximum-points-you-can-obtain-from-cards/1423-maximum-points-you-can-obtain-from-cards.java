class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        int right = cardPoints.length-k;
        int total =0,res=0;
        for(int i = right;i<cardPoints.length;i++){
            total+=cardPoints[i];
        }
        res = total;
        while(right<cardPoints.length){
            total = total + cardPoints[left] - cardPoints[right];
            res = Math.max(res,total);
            left++;
            right++;
        }
        return res;
}
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i;
        List<Boolean> trueOrFalse = new ArrayList<>();
        int largest = Integer.MIN_VALUE;
        for(i=0;i<candies.length;i++){
            if(candies[i]>largest){
                largest = candies[i];
            }
        }
        for(i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=largest){
                trueOrFalse.add(true);
            }
            else trueOrFalse.add(false);
                
        }
         return trueOrFalse;
    }
   
}
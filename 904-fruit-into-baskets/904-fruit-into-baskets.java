class Solution {
    public int totalFruit(int[] fruits) {
        int windowStart = 0;
        int windowEnd;
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> basketMap = new HashMap<>();
        for(windowEnd=0; windowEnd<fruits.length;windowEnd++){
            int endFruit = fruits[windowEnd];
            basketMap.put(endFruit,basketMap.getOrDefault(endFruit,0) +1);
            while(basketMap.size()>2){
                int startFruit = fruits[windowStart];
                 basketMap.put(startFruit,basketMap.get(startFruit)-1);
                if(basketMap.get(startFruit)==0){
                    basketMap.remove(startFruit);
                }
                windowStart++;
            }
            max = Math.max(max, windowEnd-windowStart+1);
        }
        return max;
    }
}
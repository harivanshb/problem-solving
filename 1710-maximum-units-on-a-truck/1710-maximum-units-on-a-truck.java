class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int i;
        int j;
        int size=0, cost=0;
        for(i=0;i<boxTypes.length;i++){
                if (size<truckSize){
                    if(boxTypes[i][0]+size>truckSize){
                        int size2=truckSize-size;
                        size+=truckSize-size;
                        cost+=size2*boxTypes[i][1];
                    }
                    else {
                        size = size + boxTypes[i][0];
                        cost += boxTypes[i][0] * boxTypes[i][1];
                    }
                }
        }
        return cost;
    }
}
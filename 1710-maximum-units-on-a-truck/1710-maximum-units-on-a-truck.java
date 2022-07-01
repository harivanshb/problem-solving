class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int i;
        int j;
        int size=0, cost=0;
        for(i=0;i<boxTypes.length;i++){
            for (j=0;j<boxTypes[i].length-1;j++){
                if (size<truckSize){
                    if(boxTypes[i][j]+size>truckSize){
                        int size2=truckSize-size;
                        size+=truckSize-size;
                        cost+=size2*boxTypes[i][j+1];
                    }
                    else {
                        size = size + boxTypes[i][j];
                        cost += boxTypes[i][j] * boxTypes[i][j + 1];
                    }
                }
            }
        }
        return cost;
    }
}
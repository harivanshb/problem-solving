class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int elem:arr){
            if(map.containsKey(elem)){
                map.put(elem,map.get(elem)+1);
            }
            else map.put(elem,1);
        }
       // System.out.println(map);
        int[] def = new int[arr.length+1];
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            def[entry.getValue()] +=1;
        }
        int count=0;
        int rem = 0;
        //System.out.println(Arrays.toString(def));
        for(int i=def.length-1;i>=0;){
            if(def[i]!=0){
                rem = rem+i;
                def[i] = def[i]-1;
                count++;
            }else{
                i--;
            }
            if(rem>=arr.length/2){
                break;
            }
        }
        return count ;
    }
}
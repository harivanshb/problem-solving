class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rn = new int[26];
        
        for(int i=0;i<ransomNote.length();i++){
                rn[ransomNote.charAt(i)-'a']++;
            }
        
            for(int i=0;i<magazine.length();i++){
                if(rn[magazine.charAt(i)-'a']!=0){
                    rn[magazine.charAt(i)-'a']--;
                }
            }
            for(int i=0;i<rn.length;i++){
                if(rn[i]!=0){
                    return false;
                }
            }
        return true;
}
}

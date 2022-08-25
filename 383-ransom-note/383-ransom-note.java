class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rn = new int[26];
        boolean isNotZero = false;
        for(int i=0;i<ransomNote.length();i++){
            if(rn[ransomNote.charAt(i)-'a']==0)
            {
                rn[ransomNote.charAt(i)-'a']=1;
            }else{
                rn[ransomNote.charAt(i)-'a']++;
            }
        }
            for(int i=0;i<magazine.length();i++){
                if(rn[magazine.charAt(i)-'a']!=0){
                    rn[magazine.charAt(i)-'a']--;
                }
            }
            for(int i=0;i<rn.length;i++){
                if(rn[i]!=0){
                    isNotZero = true;
                }
            }
            if(isNotZero){
                return false;
            }return true;
}
}

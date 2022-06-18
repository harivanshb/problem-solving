class Solution {

    public String reverseWords(String s) {
            int start=0;
            char[] ch = s.toCharArray();
            int end;
            for(end =0;end<ch.length;end++){
                if(ch[end]==' '){
                    reverse(ch,start,end-1);
                    start = end + 1;
                }
            }
            reverse(ch,start,ch.length-1);
        return new String(ch);
    }
    public void reverse(char[] ch, int start, int end){
            while (start < end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
    }

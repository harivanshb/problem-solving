class Solution {
    public int fib(int n) {
       int a =0;
        int b=1;
        int sum =0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
      for(int i=n;i>1;i--){
          sum=a+b;
          a = b;
          b = sum;
      }
        return b;
    }
}
class Solution {
    public int fib(int n) {
      return calculateFib(n);
    }
    public static int calculateFib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        else return calculateFib(n-1) + calculateFib(n-2);
    }
}
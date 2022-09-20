class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        
        int pre = fib(n-1);
        int pre2 = fib(n-2);
        
        return pre+pre2;
        
    }
}
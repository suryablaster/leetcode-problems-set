class Solution {
    public int ans(int n , HashMap<Integer,Integer> memo){
        if(n==0 || n==1){
            return n;
        }
        int key=n;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int pre = fib(n-1);
        int pre2 = fib(n-2);
        
        memo.put(key,pre+pre2);
        
        return pre+pre2;
    }
    public int fib(int n) {
//         if(n==0 || n==1){
//             return n;
//         }
        
//         int pre = fib(n-1);
//         int pre2 = fib(n-2);
        
//         return pre+pre2;
        
        
        return ans(n,new HashMap<Integer,Integer>());
        
    }
}
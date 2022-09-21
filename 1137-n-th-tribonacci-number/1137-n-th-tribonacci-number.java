class Solution {
    public int tribonacci(int n) {
        return trians(n,new HashMap<Integer,Integer>());
    }
    public int  trians(int n,HashMap<Integer,Integer> memo){
        if(n==0 || n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        int key = n;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        
        
        memo.put(key,trians(n-1,memo) + trians(n-2,memo) + trians(n-3,memo));
        return trians(n-1,memo) + trians(n-2,memo) + trians(n-3,memo);
    }
}
class Solution {
    public static int ans(int n , int pos,HashMap<Integer,Integer> memo){
        if(pos==n) return 1;
        if(pos>n ) return 0;
        int key = pos;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int onejump = ans(n,pos+1,memo);
        int twojump = ans(n,pos+2,memo);
        memo.put(key,onejump+twojump);
        return  onejump+twojump;
    }
    public int climbStairs(int n) {
        return ans(n,0,new HashMap<Integer,Integer>());
    }
}
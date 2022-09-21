class Solution {
    public int minCostClimbingStairs(int[] cost) {
       HashMap<Integer,Integer> memo = new HashMap<>();
        return Math.min(ans(cost , 0,memo),ans(cost,1,memo)); 
    }
    public int ans(int[] cost,int currentIndex,HashMap<Integer,Integer> memo){
        if(currentIndex==cost.length){
            return 0;
        }
        if(currentIndex>cost.length){
            return 1001;
        }
        int key = currentIndex;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        
        int onejump=cost[currentIndex] + ans(cost,currentIndex+1,memo);
        int twojump=cost[currentIndex] + ans(cost,currentIndex+2,memo);
        
        memo.put(key,Math.min(onejump,twojump));
        
        return Math.min(onejump,twojump);
        
    }
}
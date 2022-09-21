class Solution {
    public int rob(int[] nums) {
        
        return ans(nums,0,new HashMap<Integer,Integer>());
        
    }
    public int ans(int[] nums, int currentindex,HashMap<Integer,Integer> memo){
        if(currentindex>=nums.length){
            return 0;
        }
        int key = currentindex;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        
        
        int rob = nums[currentindex] + ans(nums,currentindex+2,memo);
        int norob = ans(nums,currentindex+1,memo);
            
        memo.put(key,Math.max(rob,norob));
        return Math.max(rob,norob);
    }
}
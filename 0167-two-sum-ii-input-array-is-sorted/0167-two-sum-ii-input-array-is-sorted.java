class Solution {
    public int[] twoSum(int[] nums, int target) {
               
        //o(n^2) solution 
        int[] ans = new int[2];
        int n = nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i] + nums[j] == target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
//                 }
//             }
//         }
        
//         return ans;
        
        
        //let use hashmap to do it to decrease time complexity  o(n)  tiem complexity ans space o(n) solution
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(target-nums[i])){
                ans[1]=i+1;
                ans[0]=hm.get(target-nums[i])+1;
                return ans;
            }
            hm.put(nums[i],i);
        }
        
        return ans;
    }
}
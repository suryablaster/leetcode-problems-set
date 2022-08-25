class Solution {
    public int majorityElement(int[] A) {
        int count =0;
        int candu = 0;
        for(int val:A){
            if(count==0){
                candu=val;
            }
            if(val == candu){
                count += 1;
            }else{
                count-=1;
            }
        }


        return candu;
    }
}
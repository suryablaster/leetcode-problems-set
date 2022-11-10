class Solution {
    public int maxSubArray(int[] A) {
        int n= A.length;

       int sum=0;
       int maxi=A[0];
       for(int i=0;i<n;i++){
           sum += A[i];
           if(sum>maxi) maxi=sum;
           if(sum<0) sum=0;
       }

       return maxi;
    }
}
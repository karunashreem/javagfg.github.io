class Solution{
    long maxDays(long arr[], int n){
        // code here 
        long max = Integer.MIN_VALUE;
        for(long i:arr){
            if(i>max){
                max = i;
            }
        }
        
        return max;
    }
}
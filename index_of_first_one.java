class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        for (int i=0; i<n; i++){
            if(arr[i]==1){
                return Long.valueOf(i);
            }
        }
        return Long.valueOf(-1);
    }
}
class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        int count=0;
        for(int i=0; i<n; i++){
            if (arr[i]<=x){
                count++;
            }
        }
        return count;
    }
}
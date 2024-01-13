class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        Arrays.sort(a);
        long arr[] = new long[2];
        if(n==1){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        
        Arrays.sort(a);
        arr[0] = a[0];
        boolean rs = false;
        for (int i = 1; i < n; i++) {
            if (a[i] != arr[0]) {
                arr[1] = a[i];
                rs = true;
                break;
            }
        }
        if(rs==false){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        return arr;
    }
}

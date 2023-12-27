class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
        long[] greater= new long[a.length-2];
        Arrays.sort(a);
        for(int i=0; i<a.length-2; i++){
            greater[i]= a[i];
        }
        return greater;
    }
}
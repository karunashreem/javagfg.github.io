class Solution
{
    public long sum_of_ap(long n, long a, long d)
    {
        // Code here
        long sap= 0;
        for (int i=0; i<n; i++){
            sap+=a+(i)*d;
        }
        return sap;
    }
}
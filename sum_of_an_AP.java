class Solution
{
    public int sum_of_ap(int n, int a, int d)
    {
        // Code here
        int sum=0;
        for(int i=0; i<n;i++){
            sum+=a+(i*d);
        }
        return sum;
    }
}
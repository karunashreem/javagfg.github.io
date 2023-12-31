class Solution
{
    public long sum_of_square_evenNumbers(long n)
    {
        // Code here
        long sum = 0;
        
        for(int i=1; i<=n; i++){
            int evennumber = 2*i;
            
            sum += evennumber*evennumber;
        }
        
        return sum;
    }
}
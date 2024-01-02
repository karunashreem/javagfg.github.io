class Solution
{
    public long sum_of_square_oddNumbers(long n)
    {
        // Code here
         long r=0;
        int odd=1;
        while(n!=0){
            r=(odd*odd) + r;
            odd=odd+2;
            --n;
        }
        return r;
    }
}
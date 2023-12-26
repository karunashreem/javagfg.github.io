class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long rev=0;
        long rem=0;
        while (n>0){
            rem= n%10;
            rev= (rev*10)+rem;
            n/=10;
        }
        
        return rev;
    }
}
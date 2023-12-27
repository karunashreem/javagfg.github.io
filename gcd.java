class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        if(B%A==0)
        return A;
        
        return gcd(B%A,A);
    } 
}
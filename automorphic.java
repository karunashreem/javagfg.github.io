
class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        // Code here
        return (n % 10) == ( (n*n) % 10) ? "Automorphic" : "Not Automorphic";
    }
}
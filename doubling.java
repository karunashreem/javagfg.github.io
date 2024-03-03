class Solution
{
    long solve(int n, long A[], long b)
    {
        // Complete this function
         long search=b;
        for(int i=0;i<n;i++){
            if(A[i]==search){
                b=b*2;
                search=b;
            }
        }
        b=b*2;
        return search;
    }
}
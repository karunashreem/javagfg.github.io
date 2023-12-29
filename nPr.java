
class Solution{
    static long nPr(long n, long r){
        // code here
        long fact=1;
        long rem=1;
        if (n==0 || n==1){
            fact=1;
        }
        for(int i=2; i<n+1; i++){
            fact*=i;
        }
        for(int i=2; i<(n-r+1); i++){
            rem*=i;
        }
        long res= fact/rem;
        return res;
    }
}
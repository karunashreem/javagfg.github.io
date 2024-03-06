class Solution {
    static long nthPosition(long n){
        // code here
         int i=1;
        int prev=0;
        while(n>i)
        {
            
            prev=i;
            i=i*2;
        }
        if(i==n)
        {
            return i;
        }
        return prev;
    }
}
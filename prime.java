class Solution{
    static int isPrime(int N){
        // code here
        int count=0;
        if(N<2)
        return 0;
        for(int i=2;i<=Math.sqrt(N);i++)
        {
            if(N%i==0 )
            return 0;
        }
        return 1;
    }
}
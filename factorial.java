class Solution{
    static long factorial(int N){
        // code here
        long prod=1;
        for (int i=1; i<N+1; i++){
            prod*=i;
        }
        return prod;
    }
}
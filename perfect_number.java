class Solution {
    int isPerfect(int N) {
        // code here
        int num=N;
        int sum=0;
        while(N>0){
            int r=N%10;
            sum+=fact(r);
            N/=10;
        }
        return (sum==num)?1:0;
    }
    int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
class Solution{
    static int sumOfDigits(int N) {
        // code here
        int temp=N;
        int sum=0;
        int d=0;
        while(temp>0){
            d= temp%10;
            sum+=d;
            temp/=10;
        }
        return sum;
    }
}
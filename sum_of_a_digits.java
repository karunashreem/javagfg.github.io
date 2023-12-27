
class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int sum=0;
        int temp=N;
        int d=0;
        int rev=0;
        while(temp>0){
            d=temp%10;
            rev= (sum*10)+ d;
            sum=sum+d;
            temp/=10;
        }
        int sum1= sum;
        int pal= 0;
        while (sum1>0){
            d= sum1%10;
            pal= (pal*10)+ d;
            sum1/=10;
        }
        if(pal == sum){
            return 1;
        }else{
            return 0;
        }
        
    }
}
class Solution {
    static long isSumPalindrome(long n){
        // code here
         int iterations=0;
        while(iterations<=5){
            long rem=0;
            long sum=0;
            long temp=n;
            while(n>0){
                rem=n%10;
                sum=(sum*10)+rem;
                n=n/10;
            }
            if(temp==sum)
            return sum;
            n=temp+sum;
            iterations++;
        }
        return-1;
    }
}

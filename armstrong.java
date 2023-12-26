class Solution {
    static String armstrongNumber(int n){
        // code here
        int temp = n;
        int digit = 0, last = 0, sum = 0;
        
        while(temp>0){
            temp = temp/10;
            digit++;
        }
        temp = n;
        while(temp>0){
            last = temp%10;
            sum+= (Math.pow(last, digit));
            temp = temp/10;
        }
        if(sum == n){
            return "Yes";
        }
        return "No";
    }
}
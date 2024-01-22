class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        int n = str.length();
        long ans = 0, sum = 0;
        
        for(int i=0; i<n; i++) {
            if(Character.isDigit(str.charAt(i))) {
                sum = (sum * 10) + str.charAt(i) - '0';
            } else {
                ans += sum;
                sum = 0;
            }
        } 
        ans += sum;
        return ans;
    }
    
}
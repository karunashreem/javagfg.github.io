class Solution{
    
    public static int reverse(int n){
        int sum = 0;
        
        while(n > 0){
            int rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        
        return sum;
    }
    
    public static int convertFive(int n){
    //add code here.
    
    String ans = "";
    int sum = 0;
    while(n > 0){
        int rem = n % 10;
        
        if(rem == 0){
            ans = ans + '5';
        } else {
            ans = ans + rem;
        }
        
        n = n / 10;
    }
    int res = reverse(Integer.parseInt(ans));
    return res;
    }
}
class Solution{
    static String getNumber(int B, int N){
        // code here
        String s="";
        while(N!=0){
            int x=N%B;
            s=(x>=0 && x<=9)?(x+s):((char)(55+x)+s);
            N/=B;
        }
        return s;
    }
}
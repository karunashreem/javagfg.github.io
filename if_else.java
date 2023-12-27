class Solution{
    static String compareNM(int n,int m){
        // code here
        if(n>m){
            return "greater";
        }else if (n==m){
            return "equal";
        }else{
            return "lesser";
        }
    }
}
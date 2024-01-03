class Solution{
    static String onesComplement(String S,int N){
        //code here
        StringBuilder ans = new StringBuilder();
        
        for (int i=0; i<N; i++)
        {
            ans.append((S.charAt(i)=='1') ? '0' : '1');
        }
        
        return ans.toString();
    }
}
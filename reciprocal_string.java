class Solution{
    static String reciprocalString(String S){
        // code here
         int i=0;
        String ans="";
        while(i<S.length()){
            if(S.charAt(i)>='A' && S.charAt(i)<='Z') ans+=(char)('Z'-S.charAt(i)+'A');
            else if(S.charAt(i)>='a' && S.charAt(i)<='z') ans+=(char)('z'-S.charAt(i)+'a');
            else ans+=S.charAt(i);
            i++;
        }
        return ans;
    }
}
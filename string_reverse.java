class Solution {
    static String revStr(String S) {
        // code here
        String rev= "";
        for(int i=S.length()-1; i>=0; i--){
            rev= rev+ S.charAt(i);
        }
        return rev;
    }
}
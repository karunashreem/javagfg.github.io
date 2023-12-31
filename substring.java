class Solution {
    static String javaSub(String S, int L, int R) {
        // code here
        String s= "";
        for (int i=L; i<R+1; i++){
            s+=S.charAt(i);
        }
        return s;
    }
}
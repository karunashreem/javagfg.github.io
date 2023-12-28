class Solution {
    static String delAlternate(String S) {
        // code here
        String rev="";
        for (int i=0; i<S.length(); i++){
            rev+=S.charAt(i);
            i++;
        }
        return rev;
    }
}
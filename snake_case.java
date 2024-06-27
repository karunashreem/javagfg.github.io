class Solution {
    static String snakeCase(String S , int n) {
        // code here
        S=S.toLowerCase();
        S=S.replace(" ","_");
        return S;
    }
};
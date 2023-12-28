class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String rev1="";
        String rev2= "";
        for (int i=S1.length()-1;i>-1; i--){
             rev1+= S1.charAt(i);
        }
        for (int i=S2.length()-1;i>-1; i--){
             rev2+= S2.charAt(i);
        }
        String s= rev2+ rev1;
        return s;
    }
}
class Solution {
    public int binary_to_decimal(String str) {
        // Code here
         int num = 0;
        int powerOf = str.length() -1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                num += Math.pow(2, powerOf);
            }
            powerOf--;
        }
        return num;
    }
}
class Solution {
    static String triDownwards(String S){
        // code here
        char[] chars = S.toCharArray();
        int n = chars.length;
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            for(int j=0; j<i; j++){
                result.append(".");
            }
            for(int j=i; j<n; j++){
                result.append(chars[j]);            
            }
            //result.append("\n");
        }
        return result.toString();
    }
};
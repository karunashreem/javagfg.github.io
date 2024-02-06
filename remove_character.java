class Solution{
    static String removeChars(String string1, String string2){
        // code here
        for(char c : string2.toCharArray()){
            string1 = string1.replaceAll(String.valueOf(c),"");    
        }
        return string1;
    }
}

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String s= "";
        for(int i=str.length()-1; i>-1; i--){
            s+= str.charAt(i);
        }
        return s;
        
    }
}
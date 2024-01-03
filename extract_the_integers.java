class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here
        ArrayList<String> ar = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
           String str="";
            while(i<s.length() && Character.isDigit(s.charAt(i)))
            {
            str=str+s.charAt(i);
            i++;
            }
            if(!str.isEmpty())
            ar.add(str);
        }
        return ar;
    }
} 
class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String s="";
        StringBuilder siv=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            s=s+s1.charAt(i);
            if(!(s2.contains(s)))
            {
                siv.append(s);
                
            }
            s="";
        }
        for(int i=0;i<s2.length();i++)
        {
            s=s+s2.charAt(i);
            if(!(s1.contains(s)))
            {
                siv.append(s);
                
            }
            s="";
        }
        String siva=new String(siv);
        if(siv.length()>0){
        return siva;}
        else{
            return "-1";
        }
    }
}
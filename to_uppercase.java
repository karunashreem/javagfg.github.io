class Solution
{
    public String transform(String s)
    {
        // code here
        String str[]=s.split(" ");
        String string="";
        for(String st:str)
        {
           String name = st.substring(0,1).toUpperCase() + st.substring(1);
           string=string+name+" ";
        }
        return string.trim();
    }
}
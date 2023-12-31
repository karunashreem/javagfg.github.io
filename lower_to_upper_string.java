class Solution 
{ 
    String to_upper(String str) 
    { 
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            sb.append((char)(str.charAt(i)-32));
        }
        return sb.toString();
    }
} 
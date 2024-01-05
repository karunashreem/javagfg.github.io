class Solution 
{ 
    String convert(String s) 
    {StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                sb.append((char)(90-(s.charAt(i)-65))); //90-(B-65)
            }
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                sb.append((char)(122-(s.charAt(i)-97))); //122-(b-97)
            }
        }
        return sb.toString();
    }
} 
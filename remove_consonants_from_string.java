
class Solution
{
    public String removeConsonants(String s)
    {
        //code here.
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)>=0) sb.append(c);
        }
        
    return sb.toString().isEmpty()?"No Vowel":sb.toString();
    }
    
}

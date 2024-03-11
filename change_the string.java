
class Solution{
    String modify(String s){
        if(s.charAt(0)>='a'&&s.charAt(0)<='z')
        return s=s.toLowerCase();
        
        return s=s.toUpperCase();
    }
}
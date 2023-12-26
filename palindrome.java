class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String s= Integer.toString(n);
        String s2= "";
        for (int i=s.length()-1; i>=0; i--){
            s2= s2+ s.charAt(i);
        }
        if (s2.equals(s)){
            return "Yes";
        }else{
            return "No";
        }
    }
}
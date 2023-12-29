class Sol
{
    Boolean check (String s)
    {
        // your code here   
        int n=s.length();
        for(int i=0 ; i<n; i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
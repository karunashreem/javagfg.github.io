class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        // code here
         int m = -1;
        int sum =0;
        for(int i =0;i <S.length();i++)
        {
            if(Character.isDigit(S.charAt(i)))
            {
                sum = sum *10 + Integer.valueOf(S.charAt(i) - '0');
                m = Math.max(m,sum);
                
            }
            else
            {
                sum =0;
            }
        }
        return m;
    }    
} 

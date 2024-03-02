public static String printNumber(String s, int n) 
{
    //Your code here
     StringBuilder sb = new StringBuilder ();
    for(int i = 0;i<n;i++)
    {   
        int a = s.charAt(i);
        if(a>=97 &&a <= 99)
        sb.append(2);
        
        if(a>=100 &&a <= 102)
        sb.append(3);
        
        if(a>=103 &&a <= 105)
        sb.append(4);
        
        if(a>=106 &&a <= 108)
        sb.append(5);
        
        if(a>=109 &&a <= 111)
        sb.append(6);
        
        if(a>=112 &&a <= 115)
        sb.append(7);
        
        if(a>=116 &&a <= 118)
        sb.append(8);
        
        if(a>=119 &&a <= 122)
        sb.append(9);
    }
    return sb.toString();
}
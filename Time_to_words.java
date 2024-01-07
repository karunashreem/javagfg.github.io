class Solution
{
    public String timeToWord(int H, int M)
    {
        // code here
        String[] arr1=new String[]{ "one","two","three","four","five","six","seven","eight","nine"};
        String[] arr2=new String[]{ "ten","twenty","thirty","forty","fifty"};
        String[] arr3=new String[]{ "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}; 
        
        if(M>30){
            H++;
            if(H>12){ H=1; }
        }
        
        String hour;
        if(H<10){ hour=arr1[H-1]; }
        else if(H==10){ hour="ten"; }
        else { hour=arr3[H-11]; }
        
        if(M==0){ return hour+" o' clock"; }
        
        if(M==15){ return "quarter past "+hour; }
        
        if(M==45){ return "quarter to "+hour; }
        
        if(M==30){ return "half past "+hour; }
        
        String minutes;
        if(M<10){ minutes=arr1[M-1]; }
        else if(M==10){ minutes="ten"; }
        else if(M<20){ minutes=arr3[M-11]; }
        else{
            minutes=arr2[(M/10)-1];
            if(M>10 && (M%10)!=0){
                minutes+=" "+arr1[(M%10)-1];
            }
        }
        
        if(M<30){
            return minutes+" "+((M==1)?"minute":"minutes")+" past "+hour; 
            
        }
        
        M=60-M;
        if(M<10){ minutes=arr1[M-1]; }
        else if(M==10){ minutes="ten"; }
        else if(M<20){ minutes=arr3[M-11]; }
        else{
            minutes=arr2[(M/10)-1];
            if(M>10 && (M%10)!=0 ){
                minutes+=" "+arr1[(M%10)-1];
            }
        }
        return minutes+" "+((M==1)?"minute":"minutes")+" to "+hour;
    }
}
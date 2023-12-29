class Solution{
    static int oppositeFaceOfDice(int N){
        // code here
        int i=0;
        switch(N){
            case 1:
                i= 6;
                break;
                
            case 2:
                i= 5;
                break;
                
            case 3:
                i= 4;
                break;
               
            case 4:
                i= 3;
                break;
                
            case 5:
                i= 2;
                break;
                
            case 6:
                i= 1;
                break;
    
        }
        return i;
        
    }
}
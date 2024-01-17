class Solution
{
    //Function to check if a string is Isogram or not.
    static final int CHAR=256;
    static boolean isIsogram(String data){
     
        int count[]=new int[CHAR];


        for(int i=0;i<data.length();i++){
            count[data.charAt(i)]++;
        }


        for(int i=0;i<CHAR;i++){
            if(count[i]>1){
                return false;
            }
        }


        return true;
    }
}
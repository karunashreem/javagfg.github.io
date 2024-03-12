
class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int countR=0;
        int countG=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='R'){
                countR+=1;
            }
            else{
                countG+=1;
            }
        }
        if(countR<countG){
            return countR;
        }
        
        return countG;
    }
}r
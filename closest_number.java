class Solution {
    static int closestNumber(int N , int M) {
        // code here
         int  rem = N % M;
            if(rem==0)//here if N<M then return N;
        {
            return N;
        }
        int i=N,j=N;//this two values is used to check forward and backword values
        while(true)
        {
            if(i%M==0)
            {
                return i;
            }else{
                i--;//here we come backword
            }
            
            if(j%M==0)
            {
                return j;
            }else{
                j++;//then we move forward
            }
        }
    }
};
class Solution {
    static int findPosition(int N) {
        // code here
         int count=0;
        int index=-1;
        for(int i=0;i<32;i++)
        {
            if(((N>>i)&1)==1) 
            {
            count++;
            index=i;
            }
        }
        if(count!=1)
         return -1;
    
         return index+1;
    }
};
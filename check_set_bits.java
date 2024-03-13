class Solution{
    static int isBitSet(int N){
        //code here
         if (N == 0) {
            return 0;
        }
        
        // Count the number of bits in N
        int numBits = (int) (Math.log(N) / Math.log(2)) + 1;
        
        // If the number is a power of 2, return true
        if(N==(1 << numBits) - 1){
            return 1;
        }
        
        return 0;
    }
}
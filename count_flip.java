
class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        return Integer.bitCount(a ^ b);
        
    }
    
    
}
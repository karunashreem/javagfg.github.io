class Solution{
    static long kthDigit(int A,int B,int K){
        // code here
         String x=""+(long)Math.pow(A,B);
        int y= Character.getNumericValue(x.charAt(x.length()-K));
        return (long)y;
    }
}
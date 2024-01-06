class Solution {
    static int getCompundInterest(int P , int T , int N , int R) {
        // code here
        double CI = P * (Math.pow((1 + ((R/100.00)/N)), N * T));
        return (int) CI;
    }
};
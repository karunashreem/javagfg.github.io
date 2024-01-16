class Solution {
    long sumOfSeries(long N) {
        // code here
        long num = (long)(N*N*0.5 + N*0.5);
        return num * num;
    }
}
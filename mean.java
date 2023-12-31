class Solution {
    static int mean(int N , int[] A) {
        // code here
        int sum=0;
        for (int i=0; i<N; i++){
            sum+=A[i];
        }
        int div= sum/N;
        return div;
    }
};
class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int sum1 = 0;

        int sum2 = 0;

        for (int i = 0; i < N; i++) {

            sum1 += Grid[i][i];

            sum2 += Grid[i][N-i-1];

        }

        int ans = Math.abs(sum1-sum2);

        return ans;
    }
}
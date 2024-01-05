class Solution
{
    public void  Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        int len = matrixA.length;

        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {

                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];

            }

        }
    }
}
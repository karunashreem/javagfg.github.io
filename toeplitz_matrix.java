class GfG
{
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][], int N, int M)
    {
        // Your code here
        for(int i=0; i<N-1; i++) {
            for(int j=0; j<M-1; j++) {
                if(mat[i][j] != mat[i+1][j+1]) {
                return false;
                }
            }
        }
        return true;
    }
}
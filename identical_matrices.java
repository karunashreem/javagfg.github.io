class Solution {
    int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) {
        // code here
        int flag=1;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(Grid1[i][j]!=Grid2[i][j]){
                    flag=0;
                    break;
                }
            }
        }
        return flag;
        
    }
}
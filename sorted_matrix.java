class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i = 0; i< N ;i++){
            for(int j = 0 ; j<N;j++){
                li.add(Mat[i][j]);
            }
        }
        Collections.sort(li);
        int[][] sortedMat = new int[N][N];
        int ans = 0;
        for(int i = 0; i< N;i++){
            for(int j = 0; j<N;j++){
                sortedMat[i][j] = li.get(ans);
                ans++;
            }
        }
        return sortedMat;
    }
};
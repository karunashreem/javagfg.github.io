class Solution {
    static int numOfPerfectSquares(int a, int b) {
        // code here
        int count=0;
        for (int i=1; i<=b;i++){
            if((i*i) <= b && (i*i) >=a){
                count++;
            }
        }
        return count;
    }
};
class Solution {
    static int cubeRoot(int N) {
        // code here
        int i = 1;
        while( N >= i*i*i){
        i++;
        }
        return i-1;
    }
};
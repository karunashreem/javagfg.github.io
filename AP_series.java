class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        // code here
        int dif= A2-A1;
        int t4= A1+ ((N-1)*dif);
        return t4;
    }
}
class Solution {
    static int getAngle(int H , int M) {
        // code here
        float m = M*6;
        float c = ((float)M/60) * 30;
        float h = H*30 + c;
        float ans = Math.abs(h-m);
        float b = 360 - ans;
        return (int)Math.floor((Math.min(ans,b)));
    }
};
class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int[] area = new int[3];
        area[0] = L * W;
        area[1] = (int)(0.5 * B * H);
        area[2] = (int) (3.14 * R * R);
        return area;
    }
};
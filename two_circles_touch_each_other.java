class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        //Write your code here
        int d1 = X2 - X1;
        int d2 = Y2 - Y1;
        
        int c2c1 = (d1*d1)+(d2*d2);
        
        int res = (int)Math.sqrt(c2c1);
        
        
        if(res >= R1+R2){
            return 0;
        }else{
            return 1;
        }
    }
}
class Solution {

    public void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        int aScore = 0;
        int bScore = 0;
        
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aScore++;
            } else if (b[i] > a[i]) {
                bScore++;
            }
        }
        
        GFG.ca = aScore;
        GFG.cb = bScore;
    }
}
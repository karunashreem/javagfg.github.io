


class Solution {
    void nextGreatest(int arr[], int n) {
        // code here
        int gtr = -1;
        int temp = 0;
        for(int i=n-1; i>=0; i--){
            temp = arr[i];
            if(i==n-1){
                arr[i] = -1;
                gtr = Math.max(gtr,temp);
                continue;
            }
            arr[i] = gtr;
            gtr = Math.max(gtr, temp);
        }
    }
}
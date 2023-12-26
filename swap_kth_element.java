class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        int num1= arr[k-1];
        arr[k-1]= arr[n-k] ;
        arr[n-k] = num1;
        
    }

}
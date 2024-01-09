class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
         int[] temp = new int[d];
        d = d%n;
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
    }
}

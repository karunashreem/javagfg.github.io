
class Solution {
    void reverseSubArray(int arr[], int n, int l, int r) {
        // code here
          int temp;
        while(l<=r)
        {
            temp=arr[l-1];
            arr[l-1]=arr[r-1];
            arr[r-1]=temp;
            l++;
            r--;
        }
    }
}
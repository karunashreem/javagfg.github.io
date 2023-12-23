class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]==max)
            {
                continue;
            }
            else
            {
                int ans = arr[i];
                return ans;
            }
            
        }
        return -1;
    }
}
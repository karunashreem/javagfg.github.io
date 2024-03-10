
class Solution {
    int totalCount(int[] arr, int n, int k) {
        // code here
        int count =0;
        int quo =0;
        for(int i=0;i<arr.length;i++){
           quo += arr[i]/k;  
           if(arr[i]%k !=0)
           count++;
        }
        return quo+count;
    }
}

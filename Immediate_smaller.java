class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
         int a[]=new int [n];
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                a[i]=arr[i+1];
            }
            else{
                a[i]=-1;
            }
        }
        a[n-1]=-1;
        for(int i=0;i<n;i++){
            arr[i]=a[i];
            
        }
    }
}
class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int arr[]= {-1,-1};
        int start=0;
        int end = N-1;
        while(start<=end){
            if(a[start]==key && a[end]==key) {
                 arr[0]=start;
                 arr[1]=end;
                 return arr;
            }
            if(a[start]!=key) start++;
            if(a[end]!=key) end--;
        }
       return arr;
    }
}
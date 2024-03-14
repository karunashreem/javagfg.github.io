

class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
        
       
       int i=0,j=n-1;
       
      while(i<j)
      {
          while(i<n && arr[i]%2==0)
          i++;
          
          while(j>0 && arr[j]%2!=0)
          j--;
          
          if(i<j)
          swap(arr,i,j);
          
      }
      
      Arrays.sort(arr,0,i);
      Arrays.sort(arr,i,n);
       
    }
    
    void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
}
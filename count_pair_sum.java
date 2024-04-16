class Solution
{ static int countPairs(int arr1[],int arr2[], int M, int N, int x) 
    { 
        //code here.
      int i=0;
      int j=N-1;
      int c=0;
      while(i<M && j>=0){
          if(arr1[i]+arr2[j]==x){
              i++;
              j--;
              c++;
          }else if(arr1[i]+arr2[j]<x){
              i++;
          }else{
              j--;
          }
      }
      return c;
    }
}
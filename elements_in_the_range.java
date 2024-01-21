class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        
        for(int i=0;i<n;i++){
          hs.add(arr[i]);
        }
        
        for(int i=A;i<=B;i++){
           if(!hs.contains(i)){
               return false;
           }
        }
        
       return true;


    }
}
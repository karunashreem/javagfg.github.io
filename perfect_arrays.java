class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        int start=0;
        int end=n-1;
        while(start<end){
            if(a[start++]!=a[end--]){
                return false;
            }
            
        }  
        return true;
    }
    
}

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long arr[]=new long[n];
        if(n>1){
            long a=1,b=1;
        arr[0]=a;
        arr[1]=b;
        for(int i=2;i<n;i++){
            arr[i]=a+b;
            a=b;
            b=arr[i];
        }
        }
        else{
            arr[0]=1;
          
        }
        
        return arr;
    }
}
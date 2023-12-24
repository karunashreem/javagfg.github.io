class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> s=new Stack<>();
        long []a=new long[n];
        a[n-1]=-1;
        s.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && arr[i]>=s.peek()){
                s.pop();
            }
            long out=s.isEmpty()==true?-1:s.peek();
            a[i]=out;
            s.push(arr[i]);
        }
        return a;
    } 
}
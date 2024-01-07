
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        boolean flag=true ;
        for(int i=0; i<N; i++){
            if(A[i]!= B[i]){
                flag= false;
            }
        }
        return flag;
        
    }
}
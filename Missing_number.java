
class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
        int sum=0;
        for(int i=1; i<=N; i++){
            sum += i;
        }
        int curr_sum = 0;
        for(int i=0; i<N-1; i++){
            curr_sum += A[i];
        }
        if(curr_sum != sum)
                 sum -= curr_sum;
        return sum; 
    }
}
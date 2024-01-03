class Solution
{
    public int[] find_sum(int n)
    {
        // Code here
        int odd= 0;
        int even=0;
        int[] arr= new int[2];
        for (int i=0; i<n+1; i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        arr[0]= odd;
        arr[1]=even;
        return arr;
    }
}
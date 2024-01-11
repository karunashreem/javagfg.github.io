class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int oddc= 0;
        int evenc=0;
        for (int i=0; i<n; i++){
            if ((arr[i]%2)==0){
                evenc++;
            }else{
                oddc++;
            }
        }
        System.out.println(oddc + " " + evenc);
    }
}
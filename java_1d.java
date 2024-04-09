
class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
          int sum=0, max=Integer.MIN_VALUE;
           for(int i=0;i<n;i++){
               sum+=a[i][i];

               if(b[i]>max){
                max=b[i];
               }
           }
          return new ArrayList<>(Arrays.asList(sum,max));
    }
}

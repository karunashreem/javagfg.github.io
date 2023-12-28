
class Compute
{
    String average(int A[], int N)
    {
        long sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
        }
        double avg=(double)sum/N;
        String s=String.format("%.2f",avg);
        return s;
    }
}
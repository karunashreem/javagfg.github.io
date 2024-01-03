class Solution
{
    public long[] find(int l, int b, int h)
    {
        // code here
        long L = l;
        long B = b;
        long H = h;
        long sa= 2*((L*B)+(B*H)+(H*L));
        long vol= (L*B*H);
        long[] arr= new long[2];
        arr[0]=sa;
        arr[1]=vol;
        return arr; 
    }
}
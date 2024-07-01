
class Solution {
    
    public long findDiff(long arr[], long n)
    {
        int freq[]=new int[100001];
        for(int i=0;i<arr.length;i++)
        {
            freq[(int)arr[i]]++;
        }
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++)
        {
          max=(long)Math.max(freq[i],max);
          if(freq[i]!=0)
          {
           min=(long)Math.min(freq[i],min);
          }
        }
        return max-min;

    }
}
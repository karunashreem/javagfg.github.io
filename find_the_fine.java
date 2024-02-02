class Solution {
    
    public long totalFine( long n, long date, long car[], long fine[])
    {
        long sum=0;
        if(date%2==0)
        {
            for(int i=0;i<n;i++)
            {
                if(car[i]%2!=0)
                {
                    sum=sum+fine[i];
                }
            }
        }
        else if(date%2!=0)
        {
            for(int i=0;i<n;i++)
            {
                if(car[i]%2==0)
                {
                    sum=sum+fine[i];
                }
            }
        }
        return sum;
    }
}
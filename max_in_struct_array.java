class GfG
{
    public static int findMax(Height arr[], int n)
    {
       // your code here
       int max=0;
     for(int i=0; i<n; i++)


     {

max=Math.max(max,                           (arr[i].feet*12+arr[i].inches));
     }
     return max;
    }
    
}
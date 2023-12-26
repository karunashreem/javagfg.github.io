class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        if(v.length%2==0){
            int mid = (0+(v.length-1))/2;
            return ((v[mid]) + (v[mid+1]))/2; 
        }else{
            int mid = (0+v.length)/2;
            return v[mid];
        }
    }
}
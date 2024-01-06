class Solution
{
    public int find(int[] A, int[] B)
    {
        // code here
        int AB=0,AXB=0;
        for(int i=0;i<A.length;i++){
            AB=AB+(A[i]*B[i]);
            if(i==0){
                AXB=AXB+((A[i+1]*B[i+2])-(A[i+2]*B[i+1]));
            }
            else if(i==1){
                AXB=AXB-((A[i-1]*B[i+1])-(A[i+1]*B[i-1]));
            }
            else{
                AXB=AXB+((A[i-2]*B[i-1])-(A[i-1]*B[i-2]));
            }
        }
        return AXB==0?1:(AB==0?2:0);
    }
}
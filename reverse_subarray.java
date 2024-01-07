
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        
       
        try{
            if(k>n){
           Collections.reverse(arr);
            }
            else{
                int m=n;
                int j=0;
                while(m>k){
                    Collections.reverse(arr.subList(j,j+k));
                    j=j+k;
                    m=m-k;
                }
                Collections.reverse(arr.subList(j,n));
                
            }
        }
        catch(Exception e) {
            
        }
        
    }
}
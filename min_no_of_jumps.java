class Solution{
    static int minJumps(int[] arr){
        // your code here
        int size=arr.length, left=0, right=0, res=0;
        
        while(right<size-1) {
            int farthest=0;
            
            for(int i=left; i<=right; i++) {
                farthest=Math.max(farthest, i+arr[i]);
            }
            
            if(farthest==0) return -1;
            
            left=right+1;
            right=farthest;
            res+=1;
        }
        
        return res;
    }
    }
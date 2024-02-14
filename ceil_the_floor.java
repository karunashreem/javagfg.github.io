
class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        int ceil=-1;
        int floor=-1;
        
        
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                floor=arr[i];
               
            }else{
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=x){
                ceil=arr[i];
            }else{
                break;
            }
        }
        return new Pair(floor, ceil);
    }
}


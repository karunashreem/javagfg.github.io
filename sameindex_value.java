
class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList a1= new ArrayList();
        for(int i=0; i<n; i++){
            if(arr[i]==i+1){
                a1.add(arr[i]);
            }
        }
        return a1;
    }
}
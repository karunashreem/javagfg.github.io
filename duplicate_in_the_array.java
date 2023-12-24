class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> array = new ArrayList<>();
        int already = -1;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                if(already != arr[i])//to avoid re-visit of similar numbers
                {
                    array.add(arr[i]);
                }
                already=arr[i];
            }
        }
        if(array.size()==0){
            array.add(-1);
        }
        return array;
        
    }
}
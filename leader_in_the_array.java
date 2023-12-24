class Solution{
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer>A=new ArrayList<>();
        int max=-1;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            if(arr[i]>=max) A.add(arr[i]);
        }

        ArrayList<Integer>A1=new ArrayList<>();
        for(int i=A.size()-1;i>=0;i--) {
            A1.add(A.get(i));
        }
       return A1;
    }
}

class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> arr= new  ArrayList<Integer>(10);
        for (int i=1; i<11; i++){
            arr.add(N*i);
        }
        return arr;
    }
}
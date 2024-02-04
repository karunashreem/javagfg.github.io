class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
         ArrayList <Integer>al= new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(arr[i]);
        }
        ArrayList <Integer>li=new  ArrayList<>();
        if(al.contains(x)){
        li.add(al.indexOf(x));
        li.add(al.lastIndexOf(x));
        return li;
        }
        else
        li.add(-1);
        return li;
    }
}

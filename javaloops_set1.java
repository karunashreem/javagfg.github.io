class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        int odd=0;
        int even=0;
        for(int i=1; i<N+1; i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        
        ArrayList<Integer> obj= new ArrayList<Integer>(2);
        obj.add(even);
        obj.add(odd);
        return obj;
    }
}
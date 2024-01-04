
class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        int odd= 0;
        int even=0;
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        for (int i=0; i<N; i++){
            if(i%2==0){
                even+=Arr[i];
            }else{
                odd+=Arr[i];
            }
            
        }
        a1.add(even);
        a1.add(odd);
        return a1;
    }
}
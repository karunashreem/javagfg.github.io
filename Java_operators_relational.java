class Solution{
    static void relationalOperators(int A,int B){
        // code here
        int max=A;
        int min=B;
        if(A<B){
            max=B;
            min=A;
            System.out.println(A+ " is less than "+ B);
        }else{
            System.out.println(A+ " is greater than "+ B);
        }
    }
}
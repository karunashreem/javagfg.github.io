class Solution{
    static void printFloydTriangle(int N){
        // code here
        int value = 1;
       for(int row=1;row<=N;row++){
           for(int column=1; column <= row;column++){
               System.out.print(value++ +" ");
           }
           System.out.println();
      }
    }
}
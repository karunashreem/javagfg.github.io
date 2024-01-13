class Solution{
    int middle(int A, int B, int C){
        //code here
        long total = (A/3 + B/3 + C/3)+(A%3 + B%3 + C%3);
        int diffA = (int) Math.abs(total - A);
        int min = diffA , num = A;
        int diffB = (int) Math.abs(total - B);
        if(min > diffB){
            min = diffB;
            num = B;
        }
        int diffC = (int) Math.abs(total - C);
        if(min > diffC){
            num = C;
        }
        return num;
    }
}
class Solution{
    static int isLeap(int N){
        //code here
        return N%4==0 && N%100!=0 ? 1 : N%400==0 ? 1 : 0;
    }
}
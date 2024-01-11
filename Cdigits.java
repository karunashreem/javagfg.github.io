class Solution{
    static int evenlyDivides(int N){
        // code here
        int count = 0, rem;

        int temp = N;
        while(temp > 0){
            rem = temp % 10;
            if(rem != 0 && N % rem == 0){
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }
}
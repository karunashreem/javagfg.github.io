class Solution{
    static long count_divisors(int N){
        // code here
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                 
                if (i % 3 == 0) {
                    count++;
                }

                 
                if (i != N / i && (N / i) % 3 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = findGCD(A, B);
        long lcm = findLCM(A, B, gcd);
        Long[] lng = {lcm, gcd};
        return lng;
    }
    static long findGCD(long m, long n){
        if(m == 0){
            return n;    
        }
        
        return findGCD(n % m, m);
    }
    static long findLCM(long m, long n, long gcd){
        return ((m * n) / gcd);
    }
}
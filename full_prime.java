
class Solution{
	static int fullPrime(int N){
	    //code here
	    for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i==0){
                return 0;
            }
        }
        while(N>0){
            if(N%10!=2 && N%10!=3 && N%10!=5 && N%10!=7) return 0;
            N/=10;
        }
        return 1;
	}
}
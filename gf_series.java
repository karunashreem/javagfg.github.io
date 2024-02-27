class Solution{
    static long solve(int N){
         if(N==1){
            return 0;
        }
        if(N==2){
            return 1;
        }
        
        long a = solve(N-2)*solve(N-2);
        long b = solve(N-1);
        return (a-b);
    }
    static void gfSeries(int n){
        // code here
        for(int i = 1; i<=n; i++){
            System.out.print(solve(i) + " ") ;
        }
        
        System.out.println();
    }
}
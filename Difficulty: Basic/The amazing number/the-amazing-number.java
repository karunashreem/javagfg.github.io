//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isAmazing(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long isAmazing(long n){
        // code here
        int count = 0;
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0)
                count++;
            if(count > 3)
                return 0;
        }
        if(count == 2)
            return 1;
        return 0;
    }
}
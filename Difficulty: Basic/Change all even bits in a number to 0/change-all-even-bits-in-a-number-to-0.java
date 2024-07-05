//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.convertEvenBitToZero(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long convertEvenBitToZero(long n) {
        // code here
         long num =0;
        ArrayList<Long > bin = new ArrayList<>();
        while(n != 0)
        {
            long x = n % 2;
            bin.add(x);
            n = n / 2;
        }
        for(int i=0; i<bin.size();i++)
            if(i%2 == 0)
            bin.set(i,0L);
        for(int i=0; i< bin.size();i++)
            num +=bin.get(i) *(long)Math.pow(2,i);
        return num;
    }
}
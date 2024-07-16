//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here
         int sum = 0;
        int temp = N;
        int store[] = new int[10];
        store[0] = 1;
        store[1] = 1;
        for(int i = 2;i<10;i++)
        {
            store[i] = i*store[i-1];
        }
        while(N != 0)
        {
            int rem = N%10;
            sum = sum+store[rem];
            N=N/10;
        }
        return sum==temp?1:0;
    }
};
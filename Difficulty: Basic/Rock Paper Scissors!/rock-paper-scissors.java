//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.gameResult(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String gameResult(String s)
    {
        // your code here
        char a = s.charAt(0);
        char b = s.charAt(1);
        if ((a == 'R' && b == 'S') || (a == 'S' && b == 'P') || (a == 'P' && b == 'R')) {
            return "A";
        } else if ((b == 'R' && a == 'S') || (b == 'S' && a == 'P') || (b == 'P' && a == 'R')) {
            return "B";
        }
        return "DRAW";
    }
}
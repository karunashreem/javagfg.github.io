//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length()!=S2.length()){
            return 0;
        }
        else{
            char c1[]=S1.toCharArray();
            char c2[]=S2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            if(Arrays.equals(c1,c2)){
                return 1;
            }
            else{
                return 0;
            }
    }
}
}
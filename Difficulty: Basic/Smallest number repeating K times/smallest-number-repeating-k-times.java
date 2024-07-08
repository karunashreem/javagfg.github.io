//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends


class Solution
{
    int findDuplicate(int arr[], int N,int K)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            int key=arr[i];
            int freq=hm.getOrDefault(key,0);
            hm.put(key,freq+1);
        }
        //--------------
        int ans=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            int key=e.getKey();
            int val=e.getValue();
            
            if(val==K && key<ans)
            {
                ans=key;
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        else return ans;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }


            Solution ob = new Solution();
            int ans=ob.findDuplicate(a,n,k);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		new Solution().sortHalves (arr, n);
    	    for (int i = 0; i < n; ++i)
    	        System.out.print (arr[i] + " ");
    	    System.out.println ();
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static void sortHalves (int arr[], int n)
    {
        // your code here
        int i=0;

        int j=0;

        for(int k=0; k<n-1; k++)

        {

            if(arr[k]>arr[k+1])

            {

                j=k+1;

                break;

            }

        }

        int[] arr1=new int[j];

        int[] arr2=new int[n-j];

        for(int v=0; v<j; v++)

        {

            arr1[v]=arr[v];

        }

        int cc=0;

        for(int v=j; v<n; v++)

        {

            arr2[cc++]=arr[v];

        }

        int x=0;

        int y=0;

        int l=0;

        while(x<j && y<(n-j))

        {

            if(arr1[x]<arr2[y])

            {

                arr[l++]=arr1[x++];

            }

            else

            {

                arr[l++]=arr2[y++];

            }

        }

        while(x<j)

        {

            arr[l++]=arr1[x++];

        }

          while(y<(n-j))

        {

            arr[l++]=arr2[y++];
        }
    }
}
//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.dupLastIndex(arr, sizeOfArray);
		    for(int i: ans)
		        System.out.print(i + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> dupLastIndex (int arr[], int n) {
        //Complete the function
         ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=n-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                result.add(i);
                result.add(arr[i]);
                break;
                
                
            }
        }
        if(result.size()==0){
            result.add(-1);
        }
        return result;
    }
    
    
}



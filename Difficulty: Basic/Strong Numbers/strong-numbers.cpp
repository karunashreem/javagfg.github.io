//{ Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
	public:
		int is_StrongNumber(int n)
		{
		    // Code here.
		      int copy = n;
      int totalAdd =0;
      
      while (n > 0){ 
          int ld = n % 10; // lastdigit 5
          int mul = 1;
          
        for(int a=1; a<=ld; a++){ 
            mul *=a; // factorial nikal k dega 
          }
          
           totalAdd +=mul; // added factorial in total add 
          n /=10; // removed lastDigit;
       }
       return copy == totalAdd ? 1 : 0;
		}
};


//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n; 
    	cin >> n;
    	Solution ob;
    	int ans = ob.is_StrongNumber(n);
    	cout << ans <<"\n";
    }
	return 0;
}

// } Driver Code Ends
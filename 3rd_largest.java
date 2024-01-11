class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
	    return a[n-3];
    }
}

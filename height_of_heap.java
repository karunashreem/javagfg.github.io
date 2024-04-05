class Solution{
    static int heapHeight(int N, int arr[]){
        // code here
        int count = 0;
        int i = 0;
        while (i < N) {
            i = 2 * i + 1;
            count++;
        }
        
        return count - 1;
    }
}
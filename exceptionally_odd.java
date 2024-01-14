
class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int result=0;
        for(int i:arr)
        {
            result^=i;
        }
        return result;
    }
}

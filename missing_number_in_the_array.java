class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int count =1;
        for(int i = 0;i<array.length;i++)
        {
            if(count==array[i])
            {
                count++;
            }
            else
            {
                return count;
            }
        }
        return count;
        
    }
}
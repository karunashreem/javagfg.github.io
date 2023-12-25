class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        long sum = ((long)n*(n+1))/2;
        return sum;
    }
}

//Takes too much time
// class Solution {
//     // function to return sum of  1, 2, ... n
//     long seriesSum(int n) {
//         // code here
//         int sum=0;
//         for(int i=0; i<=n; i++){
//             sum=sum+i;
//         }
//         return sum;
//     }
// }
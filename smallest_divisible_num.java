class Solution {
    static long gcd( long a, long b)
    {
    if (b == 0)
    return a;
    return gcd(b, a % b);
    }
       public static long getSmallestDivNum(int n){
           // code here
           
    long res=1;
    for(int i =2; i<=n; i++)
    {
    res = (res*i)/gcd(res,i);
    
    }
    return res;
       }
    }
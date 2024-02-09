class Solution
{
    public int gcd(int N , int arr[]) 

    {

        if(arr.length == 1){

            return arr[0];

        }

       int num = gcd(arr[0],arr[1]);

       for(int i=2; i<arr.length; i++){

           num = gcd(num,arr[i]);

       }

       return num;

    }

    static int gcd(int a,int b){

        if(a == 0){

            return b;

        }

        return gcd(b%a,a);

    } 
}
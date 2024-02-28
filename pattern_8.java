class Solution {

    void printTriangle(int n) {
        // code here
          
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=2*n-2*i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
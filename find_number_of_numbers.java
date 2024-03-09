class GfG
{
          public static int num(int a[], int n, int k)
            {
                 //Your code here
                 int count=0;
                 for(int i=0;i<n;i++){
                     int temp=a[i];
                     int rem=0;
                     while(temp>0){
                         rem=temp%10;
                         if(rem==k){
                             count++;
                         }
                         temp=temp/10;
                     }
                 }
                 return count;
            }
}
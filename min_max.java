
class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=a[0];
        long max=0;
        
        for(long i:a){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
       
        return (new Pair(min,max));
    }
}

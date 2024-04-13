
class Solution
{
    ArrayList<Long> arranged(long a[], int n)
    {
         int i=0;//pointers to +ve elements
        int j=0;//pointers to -ve elements
        
        while(i<n && a[i]<0) i++;//i points to 1st positive elements
        while(j<n && a[j]>0) j++;//j points to 1st negative elements
        
        ArrayList<Long> l=new ArrayList<>();
        
        while(i<n || j<n)
        {
            l.add(a[i]);i++;
            //now move i to next +ve elemtns
            while(i<n && a[i]<0) i++;
            
            
            l.add(a[j]);j++;
            //now move j to next -ve elemtns
            while(j<n && a[j]>0) j++;
        }
        
        return l;


    }
}




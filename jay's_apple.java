
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minimum_apple (int arr[], int n) {
        //Complete the function
          int count=0;
           HashSet<Integer>set=new HashSet<>();
           for(int i=0;i<n;i++){
               set.add(arr[i]);
           }
           count=set.size();
           return count;
    }
    
    
}



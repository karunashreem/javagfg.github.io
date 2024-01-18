class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        int a[]=new int[n];
        for(int i=0;i<n-1;i++){
            a[i]=arr[i]^arr[i+1];
        }
        a[n-1]=arr[n-1];
        return a;
    }
    
    
}




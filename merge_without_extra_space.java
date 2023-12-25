long[] arr3 = new long[m+n];
        
        int i=0,j=0,k=0;
        
        while(i<arr1.length){
            arr3[k++] = arr1[i++];
        }
        
        while(j<arr2.length){
            arr3[k++] = arr2[j++];
        }
        
        Arrays.sort(arr3);

        i=0;j=0;k=0;
        while(i<arr1.length){
           arr1[i++] = arr3[k++]  ;
        }
        
        while(j<arr2.length){
            arr2[j++] = arr3[k++] ;
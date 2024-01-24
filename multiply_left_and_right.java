if(n%2==0){
    int left[] = new int[n/2];
    int right[] = new int[n/2];
    //System.out.println(left.length + " " + right.length);
    int sum1 = 0;
    int sum2 = 0;
    for(int i=0; i<left.length; i++){
        left[i] = arr[i];
    }
    for(int i=left.length; i<n; i++){
        right[i-left.length] = arr[i];
    }
    for(int i=0; i<left.length; i++){
        sum1 += left[i];
        sum2 += right[i];
    }
    //System.out.println(sum1 + " " + sum2);
    return sum1*sum2;
}
else{
    int right[] = new int[(n/2)+1];
    int left[] = new int[(n/2)];
    //System.out.println(left.length + " " + right.length);
    int sum1=0;
    int sum2=0;
    for(int i=0; i<left.length; i++){
        left[i] = arr[i];
    }
    for(int i=left.length; i<n; i++){
        right[i-left.length] = arr[i];
    }
    for(int i:left){
        sum1 += i;
    }
    for(int i:right){
        sum2 += i;
    }
    //System.out.println(sum1 + " " + sum2);
    return sum1*sum2;
}
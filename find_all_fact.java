static ArrayList<Long> factorialNumbers(long N){
    // code here
     ArrayList<Long> al=new ArrayList<>();
    long fact=1;
    int i=1;
    while(fact<=N){
        al.add(fact);
        i++;
        fact=fact*i;
    }
    return al;
}

class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        ArrayList<Integer> obj=new ArrayList<Integer>();
        int temp= a;
        a= b;
        b= temp;
        obj.add(a);
        obj.add(b);
        return obj;
        
    }
}
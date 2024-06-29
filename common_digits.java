class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int n:nums){
            while(n!=0){
                int t = n%10;
                if(!temp.contains(t))
                    temp.add(t);
                n/=10;
            }
        }
        Collections.sort(temp);
        int[] arr = new int[temp.size()];
        for(int i=0;i<temp.size();i++)
            arr[i]=temp.get(i);
        return arr;
    }
}
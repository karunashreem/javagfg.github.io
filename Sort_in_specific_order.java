class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        ArrayList<Long> even_array = new ArrayList<>();
        ArrayList<Long> odd_array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even_array.add(arr[i]);
            } else {
                odd_array.add(arr[i]);
            }
        }

        // Sort odd array in descending order
        Collections.sort(odd_array, Collections.reverseOrder());

        // Sort even array in ascending order
        Collections.sort(even_array);

        int i;

        for (i = 0; i < odd_array.size(); i++) {
            arr[i] = odd_array.get(i);
        }

        for (int j = 0; j < even_array.size(); j++) {
            arr[i] = even_array.get(j);
            i++;
    }
}
}
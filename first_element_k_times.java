class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array to calculate the frequency of each element
        for (int i = 0; i < n; i++) {
            frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0) + 1);

            // Check if the current element occurs at least K times
            if (frequencyMap.get(a[i]) == k) {
                return a[i];
            }
        }

        // If no element occurs at least K times, return -1 (or any suitable default value)
        return -1;
    } 
}
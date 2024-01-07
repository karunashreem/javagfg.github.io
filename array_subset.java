
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Map<Long, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in a1
        for (long num : a1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check if each element in a2 is present in the map and has a positive frequency
        for (long num : a2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
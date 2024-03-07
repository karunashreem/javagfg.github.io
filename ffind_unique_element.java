class Solution {
    
    public int findUnique(int a[], int n, int k)
    {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(a);
        int ans = 0;

        for (int x : a) {
            if (hs.contains(x)) {
                continue;
            } else {
                hs.add(x);
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == x) {
                        count++;
                    }
                }
                if (count % k != 0) {
                    ans = x;
                    break;
                }
            }
        }

        return ans;
    }
}
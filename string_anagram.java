class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        char[] arr1 = s.toCharArray();
        char[] arr2 = s1.toCharArray();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c:arr1) {
        count1[c - 'a']++;
        }

        for (char c:arr2) {
        count2[c - 'a']++;
        }

        int diff = 0;
        for (int i = 0; i < 26; i++) {
        diff += Math.abs(count1[i] - count2[i]);
        }

return diff;
        }
}
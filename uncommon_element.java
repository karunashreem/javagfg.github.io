class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        Set<Character> a = new HashSet<>();
for (char c : A.toCharArray()) {
a.add(c);
}
Set<Character> b = new HashSet<>();
for (char c : B.toCharArray()) {
b.add(c);
}
int[] arr = new int[26];
 
for (Character c : a) {
arr[c - 'a']++;
}
for (Character c : b) {
arr[c - 'a']--;
}
StringBuilder sb = new StringBuilder();
 
for (int i = 0; i < arr.length; i++) {
if (arr[i] != 0) {
char c = (char) (i + 'a');
sb = sb.append(c);
}
}
           if(sb.length() == 0){
               return "-1";
           }
            return sb.toString();
    }
}
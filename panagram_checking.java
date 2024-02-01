class Solution
{
    public static boolean checkPangram  (String s) {
        // your code here
        String rs = s.replaceAll("[\\s\\p{P}]", "").toLowerCase();
         if(rs.length()<26){
             return false;
         }
         
         int freq[]=new int[26];
         for(char ch:rs.toCharArray()){
             freq[ch-'a']++;
         }
         
         for(int i=0;i<26;i++){
             if(freq[i]==0){
                 return false;
             }
         }
         return true;
        
    }
}
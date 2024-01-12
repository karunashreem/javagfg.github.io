
class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        Map<Character,Integer> map = new TreeMap<Character,Integer>();
        
        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int val = map.get(ch);
                map.put(ch,val+1);
            }
        }
        Set<Character> keys = map.keySet();
        char res = '\0';
        int max = 0;
        for(char key : keys){
            int val = map.get(key);
            if(val > max){
                max = val;
                res = key;
            }
        }
        return res;
    }
    
}
class Solution
{
    char firstRep(String S)
    {
        // your code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        for(int i=0;i<S.length();i++){
            
            if(map.get(S.charAt(i))>1){
                return S.charAt(i);
            }
        }
        return '#';
    }
}

class Sol
{
     int isPossible (String S)
    {
       HashMap<Character,Integer> map=new HashMap();
       for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
           if(map.containsKey(ch)){
               
               map.put(ch,map.get(ch)+1);
           }else{
               map.put(ch,1);
           }
       }
       int count=0;
       for(char ch:map.keySet()){
           if(map.get(ch)%2!=0){
               if(count==1)return 0;
               count++;
           }
       }
       return 1;
}
}
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        Queue<Character>qu1=new LinkedList<Character>();
        Queue<Character>qu2=new LinkedList<Character>();
        for(char c:S1.toCharArray()){
            qu1.add(c);
        }
        for(char c:S2.toCharArray()){
            qu2.add(c);
        }
        int n=S1.length()+S2.length();
        String res="";
        while(res.length()<n){
            if(!qu1.isEmpty()){
                res+=qu1.remove();
            }
            if(!qu2.isEmpty()){
                res+=qu2.remove();
            }
        }
        return res;
    }
} 
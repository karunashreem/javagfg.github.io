class Solution{
    boolean isSubSequence(String A, String B){
       int i=0,j=0;
       
       if(A.length()>B.length())
       return false;
       
       while(i<A.length()&&j<B.length()){
           if(A.charAt(i)==B.charAt(j)){
               i++;
           }
           j++;
       }
       
       if(i==A.length()){
           return true;
       }
       else{
           return false;
       }
    }
  
}
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       Node head = node;
       int count = 1;
       if(ind < 1){
           return 0;
       }
       while(head != null && count < ind ){
           count++;
           head = head.next;
         
       }
       if(head != null){
           return head.data;
       }
       return 0;
    }
}
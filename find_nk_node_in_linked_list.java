class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       Node current = head;
       int count=1;
       while(current.next!=null){
           count++;
           current=current.next;
       }
       int th=(int)Math.ceil((double)count/k);
       current = head;
       for(count=1;count<th&&current.next!=null;count++){
           current=current.next;
       }
       return current.data;
    }
}
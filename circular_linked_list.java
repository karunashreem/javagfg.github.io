class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	Node n=head;
    Node x=head;
    while(n!=null && n.next!=null){
         n=n.next.next;
         x=x.next;
        if(x==n){
            return true;
        }
       
    }
    return false;
	
    }
}
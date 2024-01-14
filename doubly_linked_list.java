class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node newNode=new Node(data);
Node temp=head_ref;
 
if(head_ref==null)
    head_ref=newNode;
    
if(head_ref.next==null)//EDGE CASE
{
    head_ref.next=newNode;
    newNode.prev=head_ref;
    return ;
}
 
 
while(pos>=1)
{
 
    temp=temp.next;
    
    pos--;
}    
if(temp.next!=null)    temp.next.prev=newNode;//EDGE CASE
newNode.next=temp.next;
newNode.prev=temp;
temp.next=newNode;
	}
}
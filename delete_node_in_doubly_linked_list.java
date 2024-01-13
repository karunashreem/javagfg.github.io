class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
	Node temp=head;
 
if(x==1){
    head=head.next;
    head.prev=null;
}else{
    for(int i=1;i<x-1;i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
    if(temp.next!=null){     //if we delete last node
        temp.next.prev=temp;
    }
}
 
return head;
    }
}

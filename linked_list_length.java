class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    Node slow =head1;
    Node fast  = head1;
     
     while (fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
         if(fast == null)
             return 0;
        }
           return 1;
    }
	}

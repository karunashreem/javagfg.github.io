class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        Node n=head;
        int count=0;
        while(n!=null){
            count++;
            n=n.next;
        }
        return count;
    }
}
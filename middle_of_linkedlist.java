class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node slow = head;
        Node fast = head.next;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node node = new Node(data);
        node.next =slow.next;
        slow.next = node;
        return head;
    }
}
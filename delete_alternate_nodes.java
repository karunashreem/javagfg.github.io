class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        while(head!=null && head.next!=null){
            head.next=head.next.next;
            head=head.next;
        }
    }
}
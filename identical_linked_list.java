class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        Node t1 = head1;
        Node t2 = head2;
        int cnt1 = 0;
        int cnt2 = 0;
        while(t1!=null){
            cnt1++;
            t1 = t1.next;
        }
        while(t2!=null){
            cnt2++;
            t2  = t2.next;
        }
        if(cnt1 != cnt2) return false;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null&&temp2!=null){
            cnt1++;
            cnt2++;
            if(temp1.data != temp2.data) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    
    }

}
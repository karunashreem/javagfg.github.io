class GfG
{
    public static int moduarNode(Node head, int k)
    {
        // add your code here
         int c = -1;
            ArrayList<Integer> list = new ArrayList<>();
            Node cur = head;
            while(cur != null)
            {
                list.add(cur.data);
                cur = cur.next;
            }
            for(int i = list.size()  ;i > 0 ; i--)
            {
                //int j = i + 1;
                if(i%k == 0)
                {
                    c = list.get(i - 1);
                    break;
                }
                
            }
            return c;
    }
}
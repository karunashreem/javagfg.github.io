ArrayList<Integer> list = new ArrayList<>();
        inorder(list,root);
        
        Node head = new Node(list.get(0));
        Node cur = head;
        int j = 1;
        while(j < list.size())
        {
            Node ne = new Node(list.get(j));
            cur.right = ne;
            cur = ne;
            j++;
        }
        return head;
    }
    public void inorder(ArrayList<Integer> list, Node root)
    {
        if(root == null)
        return;
        
        inorder(list,root.left);
        list.add(root.data);
        inorder(list,root.right);
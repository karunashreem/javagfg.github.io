class Tree
{
    
    static void helper(ArrayList<Integer> list , Node root){
        if(root == null)return;
        helper(list,root.left);
        helper(list,root.right);
        list.add(root.data);
        return;
    }
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        return list;
    }
}
class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {if(node == null)return -1;
        if(node.left == null)return node.data;
        if(node.left == null && node.right == null)return node.data;
        if(node.left != null)return minValue(node.left);
        return 0;}
    
}

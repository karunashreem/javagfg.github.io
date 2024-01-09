class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList <Integer> ans= new ArrayList<>();
         giv(root,ans);
        return ans;
    }
    static void giv(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        giv(root.left,ans);
        ans.add(root.data);
        giv(root.right,ans);
    }
}
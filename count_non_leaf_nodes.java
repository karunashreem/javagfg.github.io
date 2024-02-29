//function should return the count of total number of non leaf nodes in the tree.
class Solution
{
	int countNonLeafNodes(Node root) {
	    //code here
	     if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        int lc = countNonLeafNodes(root.left);
        int rc = countNonLeafNodes(root.right);
        return lc+rc+1;
	}
}
class Tree
{
	public static int getSize(Node root)
	{
	    if(root == null){
         return 0;
        }
        int count =0;
        int countLeft = getSize(root.left);
        int countRight = getSize(root.right);
        count = 1 + countLeft + countRight;
        return count;
    }
//add Code here.
}

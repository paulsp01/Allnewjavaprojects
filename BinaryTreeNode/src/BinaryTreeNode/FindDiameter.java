package BinaryTreeNode;

public class FindDiameter {
public static int findDiameter(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return 0;
	}
	
	return findHeight(root.left)+findHeight(root.right)+1;
	
}
public static int findHeight(BinaryTreeNode<Integer>root) {
	  if (root==null)
      {
          return 0;
      }
      int leftHeight=findHeight(root.left);
      int rightHeight=findHeight(root.right);
      
      return 1+Math.max(leftHeight,rightHeight);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

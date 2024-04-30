package BinaryTreeNode;

public class RemoveNode {
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
	      if(root==null) {
	          return null;
	          }
	      if(root.left==null && root.right==null) {
	          return null;
	          }
	      root.left = removeLeaves(root.left);
	      root.right = removeLeaves(root.right);
	      return root;
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

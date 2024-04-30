package BinaryTreeNode;

public class createAndInsertDuplicateNode {
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		BinaryTreeNode<Integer> newNode=new  BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=newNode;
		newNode.left=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

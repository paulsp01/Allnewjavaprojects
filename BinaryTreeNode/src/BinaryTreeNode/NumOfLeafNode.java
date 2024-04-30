package BinaryTreeNode;

public class NumOfLeafNode {
public static int countLeaf(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return 0;
	}
	if(root.left==null&&root.right==null) {
		return 1;
	}
	return countLeaf(root.left)+countLeaf(root.right);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

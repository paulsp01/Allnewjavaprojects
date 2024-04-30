package BinaryTreeNode;

public class NodesWithoutSiblings {
public static void printNodeWithoutSiblings(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return;
	}
	if(root.left==null&&root.right!=null) {
		System.out.print(root.right.data+" ");
	}else if(root.left!=null&&root.right==null) {
		System.out.print(root.left.data+" ");
	}
	printNodeWithoutSiblings(root.left);
	printNodeWithoutSiblings(root.right);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

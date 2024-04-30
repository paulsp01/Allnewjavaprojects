package BinaryTreeNode;

public class MirrorBinaryTree {
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root==null)
       return;
    if(root.left==null && root.right==null)
        return;
    mirrorBinaryTree(root.left);
    mirrorBinaryTree(root.right);
    
    BinaryTreeNode<Integer> tempL = root.left;
    root.left=root.right;
    root.right=tempL;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

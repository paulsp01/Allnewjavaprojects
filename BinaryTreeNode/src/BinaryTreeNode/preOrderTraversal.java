package BinaryTreeNode;

public class preOrderTraversal {
	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
      preOrder(root.left);
        preOrder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

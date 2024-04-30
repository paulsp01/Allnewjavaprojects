package BinaryTreeNode;

public class postOrderTraversal {
	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
       
      preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

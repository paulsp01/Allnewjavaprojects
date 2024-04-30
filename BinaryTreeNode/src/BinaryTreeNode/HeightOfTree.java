package BinaryTreeNode;

public class HeightOfTree {
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
          if(root==null){
              return 0;
          }
      
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return 1+Math.max(leftheight,rightheight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

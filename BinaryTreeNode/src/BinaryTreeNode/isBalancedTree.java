package BinaryTreeNode;

public class isBalancedTree {
	  public static int height(root) {
	        if(root==null) {
	          return 0;
	          }
	        int leftHeight=height(root.left);
	        int rightHeight=height(root.right);
	        return 1+ Math.max(leftHeight, rightHeight);
	      }

	  public static boolean isBalanced(BinaryTreeNode<Integer> root) {
          if(root==null) {
              return true;
            }
          int leftHeight=height(root.left);
          int rightHeight=height(root.right);
          if(Math.abs(leftHeight - rightHeight) >1){
              return false;
              }
          boolean isLeftBalanced = isBalanced(root.left);
          boolean isRightBalanced = isBalanced(root.right);
          return isLeftBalanced && isRightBalanced ;
          }


	   public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
	          if(root==null){
	            int height= 0;
	            boolean isBal= true;
	            BalancedTreeReturn ans= new BalancedTreeReturn();
	            ans.height= height;
	            ans.isBalanced= isBal;
	            return ans;
	          }
	          BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
	          BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
	          boolean isBal= true;
	          int height= 1+Math.max(leftOutput.height, rightOutput.height)

	          if(Math.abs(leftOutput.height-rightOutput.height)>1){
	            isBal= false;
	          }
	          if(!leftOutput.isBalanced || !rightOutput.isBalanced){
	            isBal=false;
	          }
	          BalancedTreeReturn ans= new BalancedTreeReturn()
	          ans.height= height;
	          ans.isBalanced= isBal;
	          return ans;
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

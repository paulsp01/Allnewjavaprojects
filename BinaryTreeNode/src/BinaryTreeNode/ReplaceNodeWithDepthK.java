	package BinaryTreeNode;

public class ReplaceNodeWithDepthK {
	 public static void replaceDepth(BinaryTreeNode<Integer> root,int x){
	        if(root==null){
	            return;
	        }
	        root.data=x;
	        replaceDepth(root.left,x+1);
	        replaceDepth(root.right,x+1);
	    }

		public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		    //Your code goes here
	        if(root==null){
	            return;
	        }
	        replaceDepth(root,0);   
	      
	            
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

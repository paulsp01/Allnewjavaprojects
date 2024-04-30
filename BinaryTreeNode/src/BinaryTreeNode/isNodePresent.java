package BinaryTreeNode;

public class isNodePresent {
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root==null){
            return false;
        }
     boolean   isNode=false;
        
        if(root.data==x){
            isNode=true;
            return isNode;
        }
        return (isNodePresent(root.left,x) || isNodePresent(root.right,x));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

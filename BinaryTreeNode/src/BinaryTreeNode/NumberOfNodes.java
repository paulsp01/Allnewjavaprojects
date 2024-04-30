package BinaryTreeNode;
public class BinaryTreeNode<T> {

    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data){
        this.data= data;
    }
}

public class NumberOfNodes {

	  public static int numNodes(BinaryTreeNode<Integer> root){
	        if(root==null) return 0;
	        int leftNodeCount= numNodes(root.left);
	        int rightNodeCount= numNodes(root.right);
	        return 1+leftNodeCount+rightNodeCount;
	    }

	    public static void main(String[] args){
//	        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
	//
//	        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//	        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//	        root.left = rootLeft;
//	        root.right= rootRight;
	//
	//
//	        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//	        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
	//
//	        rootLeft.right= twoRight;
//	        rootRight.left= threeLeft;
	//
	        BinaryTreeNode<Integer> root= takeTreeInputBetter(true, 0, true);
	        printTreeDetailed(root);
	        System.out.println("Num nodes "+numNodes(root));

	    }


}

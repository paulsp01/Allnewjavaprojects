package BinaryTreeNode;

public class NodeGreaterThanX {
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
        if(root==null){
            return 0;
        }
        int c=0;
        if(root.data>x){
            c++;
        }
        int cleft=countNodesGreaterThanX(root.left,x);
        int cright=countNodesGreaterThanX(root.right,x);
        c=c+cleft+cright;
         return c;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

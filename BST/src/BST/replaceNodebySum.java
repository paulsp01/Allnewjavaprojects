package BST;

public class replaceNodebySum {
	public static int replace(BinaryTreeNode<Integer>root,int sum)
	{
	    if(root==null)
	        return sum;
	    
	     sum=replace(root.right,sum);
	      sum=sum +root.data;
	      root.data=sum;
	      sum =replace(root.left,sum);
	    
	   return  sum;
	    
	}
		public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
			// Write your code here
	 if(root==null)
	     return; 
	    int ans =replace(root,0);
	    
	    return ;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

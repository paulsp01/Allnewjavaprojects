package BinaryTreeNode;

public class SumPathRootToLeaf {
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        String arr="";
        rootToLeafPathsSumToK(root,k,arr);
	}
	 public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String arr){
		 if(root==null) {
			 return;
		 }if(k==root.data&&root.left==null&&root.right==null) {
			 System.out.print(root.data);
			 return;
		 }
		 arr=arr+root.data+" ";
		 rootToLeafPathsSumToK(root.left,k-root.data,arr);
		 rootToLeafPathsSumToK(root.right,k-root.data,arr);
		
	 }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

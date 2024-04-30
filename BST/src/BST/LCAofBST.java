package BST;

public class LCAofBST {
	public static BinaryTreeNode<Integer>  getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null||root.data==a||root.data==b) {
			return root;
		}
		int curr=root.data;
		if(curr<a&&curr<b) {
			return getLCA(root.right,a,b);
		}
		if(curr>a&&curr>b) {
			return getLCA(root.left,a,b);
		}
		return root;
		
	}
	public class Solution {

		/*
		 * Binary Tree Node class
		 * 
		 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
		 * 
		 * public BinaryTreeNode(T data) { this.data = data; } }
		 */


		
		public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
			BinaryTreeNode<Integer> node=getLCAHelper(root,a,b);
	        return (node == null) ? -1 : node.data;

		}
	public static BinaryTreeNode<Integer> getLCAHelper(BinaryTreeNode<Integer> root, int a, int b) {
			if(root==null||root.data==a||root.data==b) {
				return root;
			}
			int curr=root.data;
			if(curr<a&&curr<b) {
				return getLCAHelper(root.right,a,b);
			}
			if(curr>a&&curr>b) {
				return getLCAHelper(root.left,a,b);
			}
	       
	         BinaryTreeNode<Integer> l= getLCAHelper(root.left,a,b);
		 	 BinaryTreeNode<Integer> r=getLCAHelper(root.right,a,b);
	      if(l!=null&&r!=null){
		 	 return root;
		  }else if(l!=null){
		 	 return l;
		  }
		  return r;
		
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

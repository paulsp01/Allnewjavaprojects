package BST;

public class constructBST {
	public static BinaryTreeNode<Integer>tree(int arr[],int s ,int e)
	{
	    if(s>e)
	        return null;
	    int mid=(s+e)/2;
	    
	    BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(arr[mid]);
	    
	    root.left=tree(arr,s,mid-1);
	    root.right=tree(arr,mid+1,e);
	    return root;
	}
			public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
				 return tree(arr,0,n-1);    
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

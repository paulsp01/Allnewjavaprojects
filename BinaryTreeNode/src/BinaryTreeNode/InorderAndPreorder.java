package BinaryTreeNode;

public class InorderAndPreorder {
public static BinaryTreeNode<Integer> buildTreeHelper(int in[],int pre[]){
	  BinaryTreeNode<Integer> root = buildTree(in, pre, 0 ,in.length-1, 0, pre.length-1);
  	return root;
}

	public static BinaryTreeNode<Integer> buildTree(int[] in, int[] pre, int siIn, int eiIn, int siPre, int eiPre) {
	// TODO Auto-generated method stub
		if (siPre>eiPre)
    	{
    		return null;
    	}
		
		int rootData=pre[siPre];
		 BinaryTreeNode<Integer> root=new  BinaryTreeNode<>(rootData);
		int rootIndex=-1;
		for(int i=siPre;i<=eiPre;i++) {
			if(in[i]==rootData) {
			rootIndex=i;
			break;
			}
		}
		
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		int siPreLeft=siIn+1;;
		
		int siInRight=rootIndex+1;
		int eiInRight=eiIn;
	    int eiPreRight=eiPre;
	    
	    int leftSubTreeLength=eiIn-siIn+1;
	    
		int eiPreLeft=siPreLeft+leftSubTreeLength-1 ;
		int siPreRight=eiPreLeft+1;
		
		
		
		
		
		 BinaryTreeNode<Integer> left=buildTree(in,pre,siInLeft,eiInLeft,siPreLeft,eiPreLeft);
		 BinaryTreeNode<Integer> right=buildTree(in, pre,siInRight,eiInRight,siPreRight,eiPreRight);
		 root.left=left;
		 root.right=right;
		 return root;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

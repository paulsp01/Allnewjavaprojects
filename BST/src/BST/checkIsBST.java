package BST;

public class checkIsBST {
	  public static int largest(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return Integer.MIN_VALUE;
	        }
	        int largestLeft= largest(root.left);
	        int largestRight= largest(root.right);
	        return Math.max(root.data, Math.max(largestLeft, largestRight));
	    }
	  public static int min(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return Integer.MAX_VALUE;
	        }
	        int minLeft= min(root.left);
	        int minRight= largest(root.right);
	        return Math.max(root.data, Math.max(minLeft, minRight));
	    }

	   public static boolean isBST(BinaryTreeNode<Integer> root){
	          if(root==null){
	              return true;
	          }
	          int leftMax= largest(root.left);
	          if(leftMax>=root.data){
	              return false;
	          }
	          int rightMin= min(root.right);
	          if(rightMin<root.data){
	              return false;
	          }
	          boolean isLeftBST= isBST(root.left);
	          boolean isRightBST= isBST(root.right);
	          return isLeftBST && isRightBST;

	      }
public static boolean isBST3(BinaryTreeNode<Integer> root,int minRange,int maxRange) {
	if(root==null) {
		return true;
	}
	if(root.data<minRange||root.data>maxRange) {
		return false;
	}
	boolean isLeftwithinRamge=isBST3(root.left,minRange,root.data-1);
	boolean isRightwithinRamge=isBST3(root.left,minRange,root.data-1);
	return isLeftwithinRamge&&isRightwithinRamge;
}

	  public static IsBSTreturn isBST2(BinaryTreeNode<Integer> root){
          if(root==null){
              IsBSTreturn ans = new IsBSTreturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
              return ans;
          }
          IsBSTreturn leftAns= isBST2(root.left);
          IsBSTreturn rightAns= isBST2(root.right);

          int min= Math.min(root.data, Math.min(leftAns.min, rightAns.min));
          int max= Math.max(root.data, Math.min(leftAns.max, rightAns.max));
          boolean isBST= true;
          if(leftAns.max>=root.data){
              isBST= false;
          }
          if(rightAns.min<root.data){
              isBST= false;
          }
          if(!leftAns.isBST){
              isBST= false;
          }
          if(rightAns.isBST){
              isBST= false;
          }
          IsBSTreturn ans = new IsBSTreturn(min,max,isBST);
          return ans;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

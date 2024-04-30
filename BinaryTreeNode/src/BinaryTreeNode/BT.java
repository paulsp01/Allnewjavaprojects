package BinaryTreeNode;

public class BT {
	public class BinaryTreeNode<T> {

	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data){
	        this.data= data;
	    }
	}
	 public static void printTreeDetailed(BinaryTreeNode<Integer> root){
	        if(root == null){
	            return;
	        }
	        System.out.println(root.data+":");
	        if(root.left != null){
	            System.out.print("L"+root.left.data+", ");
	            }
	        if(root.right != null){
	            System.out.print("R"+root.right.data);
	            }
	        printTree(root.left);
	        printTree(root.right);

	    }

	public class BinaryTreeUse{

	    public static void printTree(BinaryTreeNode<Integer> root){
	        if(root == null){
	            return;
	        }
	        System.out.println(root.data);
	        printTree(root.left);
	        printTree(root.right);

	    }

	    public static void main(String[] args){
	        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

	        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
	        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
	        root.left = rootLeft;
	        root.right= rootRight;

	        printTree(root);

	        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
	        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);

	        rootLeft.right= twoRight;
	        rootRight.left= threeLeft;

	    }
	}

	

	public class BinaryTreeUse{

	    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
	        if(isRoot){
	            System.out.println("Enter root data");
	        }
	        else{
	            if(isLeft){
	              System.out.println("Enter left child of "+ parentData);
	            }
	            else{
	              System.out.println("Enter right child of"+ parentData);
	            }
	        }
	        System.out.println("Enter root data");
	        Scanner s= new Scanner(System.in);
	        int rootData = s.nextInt();

	        if(rootData==-1){
	            return null;
	        }

	        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
	        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
	        BinaryTreeNode<Integer> rightChild= takeTreeInput(false, rootData, false);
	        root.left= leftChild;
	        root.right= rightChild;
	        return root;

	    }

	    public static BinaryTreeNode<Integer> takeTreeInput(){
	        System.out.println("Enter root data");
	        Scanner s= new Scanner(System.in);
	        int rootData = s.nextInt();

	        if(rootData==-1){
	            return null;
	        }

	        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
	        BinaryTreeNode<Integer> leftChild= takeTreeInput();
	        BinaryTreeNode<Integer> rightChild= takeTreeInput();
	        root.left= leftChild;
	        root.right= rightChild;
	        return root;

	    }

	    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
	        if(root == null){
	            return;
	        }
	        System.out.println(root.data+":");
	        if(root.left != null){
	            System.out.print("L"+root.left.data+", ");
	            }
	        if(root.right != null){
	            System.out.print("R"+root.right.data);
	            }
	        printTree(root.left);
	        printTree(root.right);

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

	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

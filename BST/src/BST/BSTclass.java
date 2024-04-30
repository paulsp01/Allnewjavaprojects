package BST;

public class BSTclass {
	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	 /* 
	 * Main Method being used internally
	 *	public static void main(String[] args) throws IOException {
	 *		BinarySearchTree bst = new BinarySearchTree();
	 *		int choice, input;
	 *		int q = Integer.parseInt(br.readLine());
	 *		while (q-- > 0) {
	 *			st = new StringTokenizer(br.readLine());
	 *			choice = Integer.parseInt(st.nextToken());
	 *			switch (choice) {
	 *			case 1:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.insert(input);
	 *				break;
	 *				case 2:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.remove(input);
	 *				break;
	 *			case 3:
	 *				input = Integer.parseInt(st.nextToken());
	 *				System.out.println(bst.search(input));
	 *				break;
	 *			default:
	 *				bst.printTree();
	 *				break;
	 *			}
	 *		}
	 *	}
	 */


	 /* 
	 * Main Method being used internally
	 *	public static void main(String[] args) throws IOException {
	 *		BinarySearchTree bst = new BinarySearchTree();
	 *		int choice, input;
	 *		int q = Integer.parseInt(br.readLine());
	 *		while (q-- > 0) {
	 *			st = new StringTokenizer(br.readLine());
	 *			choice = Integer.parseInt(st.nextToken());
	 *			switch (choice) {
	 *			case 1:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.insert(input);
	 *				break;
	 *				case 2:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.remove(input);
	 *				break;
	 *			case 3:
	 *				input = Integer.parseInt(st.nextToken());
	 *				System.out.println(bst.search(input));
	 *				break;
	 *			default:
	 *				bst.printTree();
	 *				break;
	 *			}
	 *		}
	 *	}
	 */

	class BSTDeleteReturn {
		BinaryTreeNode<Integer> root;
		boolean deleted;
		
		public BSTDeleteReturn(BinaryTreeNode<Integer> root, boolean deleted)
		{
			this.root=root;
			this.deleted=deleted;
		}
	}

	public class BinarySearchTree {
	    private BinaryTreeNode<Integer> root;
	    private int size;
	    
		public void insert(int data) {
			//Implement the insert() function
			root = insertHelper(root,data);
			size++;
	    }
	    
	    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x)
		{
			if (root==null)
			{
				BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
				return newRoot;
			}
			
			if (x>root.data)
			{
				root.right=insertHelper(root.right,x);
			}
			else
			{
				root.left=insertHelper(root.left,x);
			}
			return root;
		}
		
		public void remove(int data) {
			//Implement the remove() function
			BSTDeleteReturn output = deleteDataHelper(root,data);
			root=output.root;
			if (output.deleted)
			{
				size--;
			}
			//return output.deleted;
	    }
	    
	    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x)
		{
			if (root == null)
				return new BSTDeleteReturn(null,false);
			
			if (root.data < x)
			{
				BSTDeleteReturn outputRight = deleteDataHelper(root.right,x);
				root.right = outputRight.root;
				outputRight.root=root;
				return outputRight;
			}
			
			if (root.data>x)
			{
				BSTDeleteReturn outputLeft = deleteDataHelper(root.left,x);
				root.left = outputLeft.root;
				outputLeft.root=root;
				return outputLeft;
			}
			
			//Now, we handle the three sub cases where root.data=x
			//Handling case where root has no children
			if (root.left == null && root.right == null)
				return new BSTDeleteReturn(null,true);
			
			//Handling case where only left child is present
			if (root.left!=null && root.right==null)
				return new BSTDeleteReturn(root.left,true);
			
			//Handling case where only right child is present
			if (root.right!=null && root.left==null)
				return new BSTDeleteReturn(root.right,true);
				
			//Both children are present
			//Get the smallest node's data from right subtree
			int rightSmallest=minimum(root.right);
			
			//Replace current root's data with smallest node's data
			root.data=rightSmallest;
			
			//Now, delete the node with the smallest value from the right subtree
			BSTDeleteReturn outputRight = deleteDataHelper(root.right,rightSmallest);
			
			//Update the current root's right child, after removing the node with smallest value
			root.right=outputRight.root;
			
			return new BSTDeleteReturn(root,true);
		}
		
		//Find the smallest data value in the binary tree
		private static int minimum(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return Integer.MAX_VALUE;
			
			int leftMin=minimum(root.left);
			int rightMin=minimum(root.right);
			
			return Math.min(root.data, Math.min(leftMin, rightMin));
		}
		
		public void printTree() {
			//Implement the printTree() function
	        printTreeDetailed(root);
		}
	    
	    private static void printTreeDetailed(BinaryTreeNode<Integer> root)
		{
			if (root==null)
			{
				return;
			}
			System.out.print(root.data+":");
			if (root.left!=null)
			{
				System.out.print("L:"+root.left.data+",");
			}
			if (root.right!=null)
			{
				System.out.print("R:"+root.right.data);			
			}
			System.out.println();
			printTreeDetailed(root.left);
			printTreeDetailed(root.right);
		}
		
		public boolean search(int data) {
			//Implement the search() function
	        return isPresentHelper(root,data);
		}
	    
	    private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x)
		{
			if (root==null)
				return false;
			
			if (root.data==x)
				return true;
			
			if (x<root.data)
			{
				return isPresentHelper(root.left,x);
			}
			else
			{
				return isPresentHelper(root.right,x);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//another methode
	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	 /* 
	 * Main Method being used internally
	 *	public static void main(String[] args) throws IOException {
	 *		BinarySearchTree bst = new BinarySearchTree();
	 *		int choice, input;
	 *		int q = Integer.parseInt(br.readLine());
	 *		while (q-- > 0) {
	 *			st = new StringTokenizer(br.readLine());
	 *			choice = Integer.parseInt(st.nextToken());
	 *			switch (choice) {
	 *			case 1:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.insert(input);
	 *				break;
	 *				case 2:
	 *				input = Integer.parseInt(st.nextToken());
	 *				bst.remove(input);
	 *				break;
	 *			case 3:
	 *				input = Integer.parseInt(st.nextToken());
	 *				System.out.println(bst.search(input));
	 *				break;
	 *			default:
	 *				bst.printTree();
	 *				break;
	 *			}
	 *		}
	 *	}
	 */

	public class BinarySearchTree {
	    private BinaryTreeNode<Integer> root;

	    public void insert(int data) {
	        root = insertH(root, data);
	    }

	    private BinaryTreeNode<Integer> insertH(BinaryTreeNode<Integer> root, int x) {
	        if (root == null) {
	            return new BinaryTreeNode<>(x);
	        }
	        if (x <= root.data) {
	            root.left = insertH(root.left, x);
	        } else {
	            root.right = insertH(root.right, x);
	        }
	        return root;
	    }

	    public void remove(int data) {
	        root = removeH(root, data);
	    }

	    private BinaryTreeNode<Integer> removeH(BinaryTreeNode<Integer> root, int x) {
	        if (root == null) {
	            return null;
	        }
	        if (x < root.data) {
	            root.left = removeH(root.left, x);
	        } else if (x > root.data) {
	            root.right = removeH(root.right, x);
	        } else {
	            
	            if (root.left == null && root.right == null) {
	                return null; 
	            } else if (root.left == null) {
	                return root.right; 
	            } else if (root.right == null) {
	                return root.left; 
	            } else {
	                BinaryTreeNode<Integer> minNode = findMin(root.right);
	                root.data = minNode.data;
	                root.right = removeH(root.right, minNode.data);
	            }
	        }
	        return root;
	    }

	    private BinaryTreeNode<Integer> findMin(BinaryTreeNode<Integer> node) {
	        while (node.left != null) {
	            node = node.left;
	        }
	        return node;
	    }

	    public void printTree() {
	        printTreeH(root);
	    }

	    private void printTreeH(BinaryTreeNode<Integer> root) {
			if (root == null) {
				return;
			}
			String toBePrinted = root.data + ":";
			if (root.left != null) {
				toBePrinted += "L:" + root.left.data + ",";
			}
			
			if (root.right != null) {
				toBePrinted += "R:" + root.right.data;
			}
			System.out.println(toBePrinted);
			printTreeH(root.left);
			printTreeH(root.right);
		}

	    public boolean search(int data) {
	        return searchH(root, data);
	    }

	    private boolean searchH(BinaryTreeNode<Integer> root, int x) {
	        if (root == null) {
	            return false;
	        }
	        if (root.data == x) {
	            return true;
	        } else if (x < root.data) {
	            return searchH(root.left, x);
	        } else { 
	            return searchH(root.right, x);
	        }
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

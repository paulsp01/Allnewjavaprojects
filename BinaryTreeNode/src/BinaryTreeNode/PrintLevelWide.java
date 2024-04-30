package BinaryTreeNode;

public class PrintLevelWide {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> nodeToPrint=new LinkedList<BinaryTreeNode<Integer>>();
		nodeToPrint.add(root);
		while(!nodeToPrint.isEmpty()) {
			 
			 BinaryTreeNode<Integer> front = nodesToPrint.poll();
	            System.out.print(front.data+":");
	            if (front.left!=null)
	            {
	                nodesToPrint.add(front.left);
	                System.out.print("L:"+front.left.data);
	            }
	            else
	            {
	                System.out.print("L:-1");
	            }
	            
	            if (front.right!=null)
	            {
	                nodesToPrint.add(front.right);
	                System.out.print(",R:"+front.right.data);
	            }
	            else
	            {
	                System.out.print(",R:-1");
	            }
	            System.out.println();
	        }
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class levelwiseTraversal {
public static void levelOrderTraversal(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return;
	}
	Queue<BinaryTreeNode<Integer>> pendingList=new LinkedList<>();
	pendingList.add(root);
	pendingList.add(null);
	while(!pendingList.isEmpty()) {
		BinaryTreeNode<Integer> frontNode=pendingList.poll();
		if(frontNode==null) {
			System.out.println();
			if(!pendingList.isEmpty()) {
				pendingList.add(null);
			}
		}else {
			System.out.print(frontNode.data+" ");
			if(frontNode.left!=null) {
				pendingList.add(root.left);
			}
			
			if(frontNode.right!=null) {
				pendingList.add(root.right);
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

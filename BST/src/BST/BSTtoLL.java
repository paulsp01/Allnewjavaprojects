package BST;

import java.util.LinkedList;

public class BSTtoLL {
public static  LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return null;
	}
	 LinkedListNode<Integer>mid = new LinkedListNode<Integer>(root.data) ;
	 LinkedListNode<Integer> left=constructLinkedList(root.left);
	 LinkedListNode<Integer> right=constructLinkedList(root.right);
	 
	 LinkedListNode<Integer> tail=left;
	 if(tail!=null) {
		 while(tail.next!=null) {
			 tail=tail.next;
		 }
		 tail.next=mid;
	 }
mid.next=right;

if(left==null) {
	return mid;
}
return left;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

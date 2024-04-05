package LinkedLisetNew;

public class LinkedListPalindrome {
	public static Node<Integer> reverse(Node<Integer>head){
		Node<Integer> curr=head;
		Node<Integer> prev=null;
		while(curr!=null) {
			Node<Integer> temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
		
	}
	public static Node<Integer> midIndex(Node<Integer>head){
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(fast.next!=null&&fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			
		}
		return slow;
	}
	public static boolean isPlaindrome(Node<Integer>head) {
		if(head==null) {
			return true;
		}
		Node<Integer> mid=midIndex(head);
		Node<Integer> last=reverse(mid.next);
		Node<Integer> curr=head;
		while(last!=null) {
			if(last.data!=curr.data) {
				return false;
			}
			last=last.next;
			curr=curr.next;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

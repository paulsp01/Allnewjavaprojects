package LinkedLisetNew;

public class ReverseLLRecursively {
	public static Node<Integer> reverseLLR(Node<Integer>head){
		if(head==null&&head.next==null) {
			return head;
		}else {
			Node<Integer> sma=reverseLLR(head.next);
			head.next.next=head;
			head.next=null;
			return head;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

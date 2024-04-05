package LinkedLisetNew;

public class RemoveDuplicate {
public static Node<Integer> removeDuplicate(Node<Integer>head){
	if(head==null) {
		return head;
	}
	Node<Integer>ch=head;
	while(ch.next!=null) {
		if(ch.data.equals(ch.next.data)) {
			ch.next=ch.next.next;
		}else {
			ch=ch.next;
		}
	}
	return head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

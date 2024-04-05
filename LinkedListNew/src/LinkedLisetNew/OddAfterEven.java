package LinkedLisetNew;

public class OddAfterEven {
	public static Node<Integer> oddAfterEven(Node<Integer> head){
		if(head==null) {
			return head;
		}
		Node<Integer>eh=null,et=null,oh=null,ot=null;
		while(head!=null) {
			if(head.data%2==0) {
				if(eh==null) {
					eh=head;
					et=head;
				}else {
					et.next=head;
					et=et.next;
				}
			}else {
				if(oh==null) {
					oh=head;
					ot=head;
				}else {
					ot.next=head;
					ot=ot.next;
				}
			}
			head=head.next;
		}
		if(oh==null) {
			return eh;
		}else {
			ot.next=eh;
		}
		if(eh!=null) {
			et.next=null;
		}
		return oh;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

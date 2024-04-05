package LinkedLisetNew;

public class DeleteRecursively {
public static Node<Integer> deleteR(Node<Integer>head,int pos){
	if(head==null) {
		return head;
	}
	if(pos==0) {
		return head.next;
	}else {
		Node<Integer> sma=deleteR(head.next,pos-1);
		head.next=sma;
		return head;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package LinkedLisetNew;

public class insertRecursively {
public static Node<Integer> insertR(Node<Integer>head,int elem,int pos){
	if(head==null&&pos>0) {
		return head;
	}
	if(pos==0) {
		Node<Integer> newNode=new Node<>(elem);
		newNode.next=head;
		return newNode;
	}else {
		Node<Integer>sma=insertR(head.next,elem,pos-1);
		head.next=sma;
		return head;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

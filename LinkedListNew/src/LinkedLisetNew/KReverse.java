package LinkedLisetNew;

public class KReverse {
public static Node<Integer> kReverse(Node<Integer> head,int k){
	if(k==0||k==1) {
		return head;
	}
	int c=0;
	Node<Integer> curr=head,prev=null,fwd=null;
	while(c<k&&curr!=null) {
		fwd=curr.next;
		curr.next=prev;
		prev=curr;
		curr=fwd;
		c++;
	}
if(fwd!=null) {
	head.next=kReverse(fwd,k);
}
return prev;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

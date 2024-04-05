package LinkedLisetNew;

public class FindNodeInLL {
public static int findNode(Node<Integer> head,int n){
	int c=0;
	if(head==null) {
		return -1;
	}
	while(head!=null) {
		if(head.data==n) {
			return c;
		}
		c++;
		head=head.next;
	}
	return -1;
}
public static int findNodeR(Node<Integer> head,int n){
	if(head==null) {
		return -1;
	}
	if(head.data==n) {
		return 0;
	}
	int sma=findNodeR(head.next,n);
	if(sma==-1) {
		return -1;
	}
	return sma+1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

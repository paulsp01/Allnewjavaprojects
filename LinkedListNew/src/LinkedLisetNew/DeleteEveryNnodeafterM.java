package LinkedLisetNew;

public class DeleteEveryNnodeafterM {
public static Node<Integer> deleteNnode(Node<Integer>head,int M,int N ){
	if(head==null||M==0) {
		return head;
	}
	if(N==0) {
		return head;
	}
	Node<Integer> cn=head;
	Node<Integer> temp=null;
	while(cn!=null) {
		int skip=0;
		int take=0;
		while(cn!=null&&take<M) {
			if(temp==null) {
				temp=cn;
			}else {
				temp.next=cn;
				temp=cn;
			}
			cn=cn.next;
			take+=1;
		}
		while(cn!=null&&skip<N) {
			cn.next=cn;
			skip+=1;
					
					
		}
		if(temp!=null) {
			return null;
		}
	}
	return head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

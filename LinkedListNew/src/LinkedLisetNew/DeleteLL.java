package LinkedLisetNew;

public class DeleteLL {
public static Node<Integer> deleteLL(Node<Integer> head,int pos,int data){
	 if(pos==0) {
			return head.next;
		}
		if(head==null ){
	        return head;
	    }
		int c=0;
	   
		Node<Integer>  prev=head;

		while(prev!=null&&c<pos-1) {
			c++;
			prev=prev.next;
		}
	  if(prev==null||prev.next==null){
	      return head;
	  }
	Node<Integer> temp=prev.next;
	prev.next=temp.next;
	temp=null;
	return head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

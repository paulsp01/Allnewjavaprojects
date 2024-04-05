package LinkedLisetNew;




class DoubleNode{

    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(){

    }

    DoubleNode(Node<Integer> head, Node<Integer> tail){
      this.head= head;
      this.tail= tail;
    }
}
public class ReversePair {
	
	public static DoubleNode reverseRBetter(Node<Integer> head){
		   DoubleNode ans;
		    if(head==null || head.next ==null){
		        ans= new DoubleNode(head, head);
		        ans.head= head;
		        ans.tail= head;
		        return ans;
		    }

		    DoubleNode smallAns= reverseRBetter(head.next);
		    smallAns.tail.next= head;
		    head.next= null;
		    ans = new DoubleNode();
		    ans.head= smallAns.head;
		    ans.tail= head;
		    return ans;

	}
	 public static Node<Integer> reverseRBest(Node<Integer> head){
		    if(head==null || head.next==null){
		        return head;
		    }
		    Node<Integer> smallHead= reverseRBest(head.next);
		    Node<Integer> reversedTail= head.next;
		    reversedTail.next= head;
		    head.next= null;
		    return smallHead;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package LinkedLisetNew;

public class MergeSortedLL {
	public static Node<Integer> mergeSort(Node<Integer> head) {
		//Your code goes here
          if(head==null)
            return head;
        if(head.next==null)
            return head;
        Node<Integer> midNode=findmid(head);
        Node<Integer> h2=midNode.next;
        midNode.next=null;
        Node<Integer> part1=mergeSort(head);
        Node<Integer> part2=mergeSort(h2);
        Node<Integer> mergedList=mergeTwoList(part1,part2);
        return mergedList;
	}
      private static Node<Integer> findmid(Node<Integer> head) 
    {
        if(head==null)
            return head;
        Node<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
	}
     public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        Node<Integer> t1=head1,t2=head2,tail=null,head=null;
        if(t1.data<=t2.data)
        {
            head=t1;
            tail=t1;
            t1=t1.next;
        }
        else
        {
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null &&t2!=null)
        {
            if(t1.data<=t2.data)
            {
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
            else
            {
                tail.next=t2;
                tail=tail.next;
                t2=t2.next;
            }
        }
        if(t1==null)
            tail.next=t2;
        if(t2==null)
            tail.next=t1;
        return head;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

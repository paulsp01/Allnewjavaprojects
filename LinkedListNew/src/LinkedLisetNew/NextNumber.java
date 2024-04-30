package LinkedLisetNew;
import java.util.* ;
import java.io.*; 

class Node {
	public int data;
	public Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
  	}
}

public class NextNumber {
	
	public static int addOneHelper(Node head) {

        // If linked list is empty, return carry.
        if (head == null) {
            return 1;
        }

        // Add carry obtained from next node to current node data.
        int res =head.data + addOneHelper(head.next);
        // Update data and return new carry(to add to the previous node).
        head.data = (res) % 10;
        return (res) / 10;
    }

    public static Node addOne(Node head) {
        
        // Removing leading zeroes
        while (head != null && head.data == 0) {
            head = head.next;
        }

        // Add 1 to linked list from end to beginning
        int carry = addOneHelper(head);

        // If there is carry after processing all nodes,add a new node at the beginning of the linked list.
        if (carry != 0) {

            Node newHead = new Node(0);
            newHead.data = carry;
            newHead.next = head;

            // Return the new head of the resultant list
            return newHead;
        }

        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

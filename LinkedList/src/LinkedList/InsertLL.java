package LinkedList;

import java.util.Scanner;



public class InsertLL  {
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		 Node<Integer> node = new Node<>(data);
        if (pos == 0) {
            node.next = head;
            head=node;
            return head;
        }
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if (count == pos - 1) {
                node.next = temp.next;
                temp.next = node;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
	}
	
		
	
//	public static Node<Integer> takeInput1(Scanner s) {
////		Node<Integer> head = null;
////		Node<Integer> tail = null;
////		
////		int data = s.nextInt();
////		int pos=s.nextInt();
////		
////		while(data != -1) {
////			Node<Integer> newNode = new Node<Integer>(data);
////			
////			if(head == null) {
////				head = newNode;
////				tail = newNode;
////			} else {
////				tail.next = newNode;
////				tail = newNode;
////			}
////			data = s.nextInt();
////		}
//		return null;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

	
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		int data = s.nextInt();
		int pos=s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		Node<Integer> ans=insert(head,pos,data);
		System.out.println(ans);
		
		s.close();
		



	

}


}
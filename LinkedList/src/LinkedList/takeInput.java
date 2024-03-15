package LinkedList;

import java.util.Scanner;

public class takeInput {
	public static Node<Integer> createLinkedList(){
	    Node<Integer> n1= new Node<>(10);
	    Node<Integer> n2= new Node<>(20);
	    Node<Integer> n3= new Node<>(30);
	    Node<Integer> n4= new Node<>(40);
	    n1.next=n2;
	    //System.out.println("n1 "+n1+ " data "+ n1.data+" next "+n1.next);
	    n2.next=n3;
	    //System.out.println("n2 "+n2+ " data "+ n2.data+" next "+n2.next);
	    n3.next=n4;
	    //System.out.println("n3 "+n3+ " data "+ n3.data+" next "+n3.next);
	    //System.out.println("n4 "+n4+ " data "+ n4.data+" next "+n4.next);
	    return n1;

	    }
	public static Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        
        while(data != -1){
          Node<Integer> currentNode= new Node<Integer>(data);
          if(head==null){
            head=currentNode;
          }else{
            Node<Integer> tail = head;
            while(tail.next!=null){
                tail= tail.next;
            }
            tail.next= currentNode;
          }
          data=s.nextInt();
    }
        return head;
	}

	 public static void print(Node head){
	        while(head != null){
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   // Node<Integer> head = createLinkedList();
	    Node<Integer> head = takeInput();
	      print(head);
	      //Node<Integer> n1= new Node<>(10);
	     // System.out.println(head);



	}
	

}

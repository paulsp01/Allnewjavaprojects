package LinkedLisetNew;

import java.util.Scanner;

public class InsertLL {
public static Node<Integer> insertLL(Node<Integer>head,int pos,int data){
	Node<Integer> nodeToBeInserted=new Node<>(data);
	int count=0;
	Node<Integer> prev=head;
	while(count<pos-1) {
		count++;
		prev=prev.next;
	}
	if(prev!=null) {
	nodeToBeInserted.next=prev.next;
	prev.next=nodeToBeInserted;
	}
	return head;
	
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
		 Scanner s= new Scanner(System.in);
		 
		 Node<Integer> head=takeInput();
		 int pos=s.nextInt();
		 int elem=s.nextInt();
		 head=insertLL(head,pos,elem);
          print(head);
	}

}

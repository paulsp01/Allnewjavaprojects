package LinkedLisetNew;

import java.util.Scanner;

public class AppendLastEndToFirst {
public static Node<Integer> appendLastToFirst(Node<Integer>head,int n){
	if(head==null||head.next==null) {
		return head;
	}
	Node<Integer> slow=head;
	Node<Integer> fast=head;
	Node<Integer> ih=head;
	for(int i=0;i<n;i++) {
		fast=fast.next;
				}
	while(fast.next!=null) {
		slow=slow.next;
		fast=fast.next;
	}
	Node<Integer>temp=slow.next;
	slow.next=null;
	fast.next=ih;
	head=temp;
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
	    Node<Integer>head=takeInput();
     int n=s.nextInt();
     head=appendLastToFirst(head,n);
     print(head);
	}

}

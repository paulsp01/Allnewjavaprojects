package LinkedLisetNew;

import java.util.Scanner;

public class FindNode {
public static int findNode(Node<Integer>head,int n) {
	  if(head==null)
	             return -1;
				  int count=0;
	         Node<Integer> temp=head;
	       
	         while(temp!=null )
	         {
	           if( temp.data==n){
	               return count;
	           }
	           temp=temp.next;
	           count++;
	         }
	        return -1;
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
		int n=s.nextInt();
		int ans=findNode(head,n);
          //print(ans);
		System.out.println(ans);

	}

}

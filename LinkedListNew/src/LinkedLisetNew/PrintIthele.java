package LinkedLisetNew;

import java.util.Scanner;


public class PrintIthele {
	
	  public static void printIthNode(Node<Integer> head, int i){
	         
			int count=0;
			Node<Integer> temp=head;
			while(count<i&&temp!=null){
				
				temp=temp.next;
				count++;
				
			}
			
			if(temp!=null){
				 System.out.print(temp.data);
			 }

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
		//print(head);
		int i=s.nextInt();
		printIthNode(head,i);

	}

}

package Queue;

public class QueueUsingLL {
	/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/


	
	//Define the data members
   Node front;
    Node rear;
    int size;

	public QueueUsingLL() {
		//Implement the Constructor
       
        front=null;
        rear=null;
        size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
      Node newnode=new Node(data);
        size++;
        if(rear==null){
            front=newnode;
            rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
      
       
    }


    public int dequeue() {
    	//Implement the dequeue() function
      if(front==null){
          return -1;
      }
        int temp=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return temp;
    }


    public int front() {
    	//Implement the front() function
        if(front==null){
            return -1;
        }
        return front.data;
    }
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

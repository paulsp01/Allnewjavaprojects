package Stack;

public class StaclUsingLL {
	 private Node head;
	    private int size;
	    


	    public Stack() {
	        //Implement the Constructor
	        head=null;
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

	    public void push(int element) {
	        //Implement the push(element) function
	        Node newnode=new Node(element);
	        newnode.next=head;
	        head=newnode;
	        size++;
	        
	    }

	    public int pop() {
	        //Implement the pop() function
	        if(head==null){
	            return -1;
	        }
	      int temp=head.data;
	        head=head.next;
	        size--;
	        return temp;
	    }

	    public int top() {
	        //Implement the top() function
	      if( head==null){
	       return -1;
	      }
	         return head.data;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

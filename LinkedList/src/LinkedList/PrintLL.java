package LinkedList;

import java.io.IOException;

import org.w3c.dom.Node;

public class PrintLL {
	public static int lengthLL(Node <Integer>head){
		Node temp=head;
		int count =1;
		if(head==null) {
			return 0;
		}
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Node {
		    public int data;
		    public Node next;

		    Node()
		    {
		        this.data = 0;
		        this.next = null;
		    }

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }

		    Node(int data, Node next)
		    {
		        this.data = data;
		        this.next = next;
		    }
		}

		public class Runner {

		    private static final String Solution = null;
			static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    public static Node takeInput() throws IOException {
		        Node head = null, tail = null;

		        String[] datas = br.readLine().trim().split("\\s");

		        int i = 0;
		        while(i < datas.length && !datas[i].equals("-1")) {
		            int data = Integer.parseInt(datas[i]);
		            Node newNode = new Node(data);
		            if(head == null) {
		                head = newNode;
		                tail = newNode;
		            }
		            else {
		                tail.next = newNode;
		                tail = newNode;
		            }
		            i += 1;
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

		    public static void main(String[] args) throws NumberFormatException, IOException {
		        int t = 1;

		        while (t > 0) {

		            Node head = takeInput();
		            System.out.println(lengthLL(head));
		            System.out.println();

		            t -= 1;
		        }
		    }
		}

	}

}

package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElement {
	 public static Queue<Integer> reverseKElements(Queue<Integer> q, int k){
//       if(q.isEmpty()||k<=0||k>q.size()) {
//    	   return q;
//       }
//       reverseKElements(q,k);
//       while(!q.isEmpty()) {
//    	   q.add(q.poll());
//       }
//	return q;
		if(!q.isEmpty()||k>q.size()) {
			return q;
		}
		if(k<=0) {
			return q;
		}
		Stack<Integer>stk=new Stack<>();
		for(int i=0;i<k;i++) {
			stk.push(q.poll());
		}
		while(!stk.isEmpty()) {
			q.add(stk.pop());
		}
		for(int i=0;i<q.size()-k;i++) {
			q.add(q.poll());
		}
		return q;
	 }
	
	 
	 class Input 
	 {
	 	int n;
	 	int k;
	 	Queue<Integer> queue;

	 	public Input(int n, int k, Queue<Integer> queue) 
	     {
	 		this.queue = queue;
	 		this.n = n;
	 		this.k = k;
	 	}

	 }

	 public class Runner 
	 {


	     public static Input takeInput() 
	     {
	         Scanner sr = new Scanner(System.in);

	     	int n = sr.nextInt();
	     	int k = sr.nextInt();

	     	Queue<Integer> queue = new LinkedList<>();

	     	for (int i = 0; i < n; i++) 
	         {
	             int val = sr.nextInt();
	     		queue.add(val);
	     	}

	     	return new Input(n, k, queue);

	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input input = takeInput();

    	int n = input.n;
    	int k = input.k;
    	Queue<Integer> queue = input.queue;

    	queue = reverseKElements(queue, k);

    	while (!queue.isEmpty()) 
        {
    		System.out.print(queue.poll() + " ");
    	}

	}

	 }

package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
public static void ReverseQueue(Queue<Integer> input) {
	if(input.size()<=1) {
		return;
	}
	int front=input.poll();
	ReverseQueue(input);
	input.add(front);
	
}
static Scanner sr = new Scanner(System.in);
public static Queue<Integer> takeInput() 
{
    

	int n = sr.nextInt();


	Queue<Integer> queue = new LinkedList<>();

	for (int i = 0; i < n; i++) 
    {
        int var = sr.nextInt();
		queue.add(var);
	}

	return queue;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = takeInput();
		ReverseQueue(queue);

		while (!queue.isEmpty()) 
        {
			System.out.print(queue.poll() + " ");
		}

		System.out.println();

	}

}

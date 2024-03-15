package arraysearch;

import java.util.Scanner;

public class PushZeroToEnd {
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
public static void pushZeroToEnd(int[] arr) {
	int n=arr.length;
	int nonZero=0;
	for(int i=0;i<n;i++) {
		
		if(arr[i]!=0) {
			int temp=arr[nonZero];
			arr[nonZero]=arr[i];
			arr[i]=temp;
			nonZero++;
		
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		
		pushZeroToEnd(arr);
		printArray(arr);
		

	}

}

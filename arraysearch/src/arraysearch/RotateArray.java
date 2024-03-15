package arraysearch;

import java.util.Scanner;

public class RotateArray {
	
	public static void reverse(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void rotate(int[] arr,int d) {
		d=d%arr.length;
		if(d<0) {
			d=d+arr.length;
		}
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter element:"+(i+1)+"th");
			arr[i]=s.nextInt();
		}
		System.out.println("enter d");
		int d=s.nextInt();
		
		rotate(arr,d);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

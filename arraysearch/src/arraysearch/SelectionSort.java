package arraysearch;

import java.util.Scanner;

public class SelectionSort {
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void selectionSort(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min=Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
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
		
		
		selectionSort(arr);
		printArray(arr);
		
	}

}

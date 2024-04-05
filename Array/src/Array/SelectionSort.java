package Array;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=Integer.MAX_VALUE;
			int MI=-1;
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					MI=j;
				}
			}
			int temp=arr[MI];
			arr[MI]=arr[i];
			arr[i]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		selectionSort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}

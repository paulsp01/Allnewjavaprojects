package Array;

import java.util.Scanner;

public class RoteteArray {
	public static void swap(int arr[],int s,int e) {
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
	}
	public static void reverse(int arr[],int s,int e) {
		while(s<e) {
			swap(arr,s,e);
			s++;
			e--;
		}
	}
   public static void rotate(int arr[],int d) {
	   if(arr.length==0) {
		   return;
	   }
	   if(d>=arr.length&&arr.length!=0) {
		   d%=arr.length;
		   
	   }
	   reverse(arr,0,arr.length-1);
	   reverse(arr,0,arr.length-1-d);
	   reverse(arr,arr.length-d,arr.length-1);
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int d=s.nextInt();
		rotate(arr,d);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}

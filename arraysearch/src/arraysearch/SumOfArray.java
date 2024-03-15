package arraysearch;

import java.util.Scanner;

public class SumOfArray {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void sumOfArray(int[] arr1, int[] arr2,int[] output) {
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		int k=Math.max(arr1.length, arr2.length);
		while(i>=0&&j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i--;
			j--;
			k--;
		}
		while(i>=0) {
			int sum=arr1[i]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i--;
			k--;
		}
		while(j>=0) {
			int sum=arr1[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			j--;
			k--;
		}
		output[0]=carry;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array1 size");
		int m=s.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<m;i++) {
			System.out.println("enter "+(i+1)+"th element");
			arr1[i]=s.nextInt();
		}
		System.out.println("enter array2 size");
		int n=s.nextInt();
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter "+(i+1)+"th element");
			arr2[i]=s.nextInt();
		}
		int[] output=new int[Math.max(m, n)+1];
		
		sumOfArray(arr1,arr2,output);
		printArray(output);
	}

}

package Recursionnew;

import java.util.Scanner;

public class SumOfArray {
	public static int sumOfArray(int arr[]) {
		return sum(arr,0);
		
	}
	public static int sum(int arr[],int si) {
		if(si==arr.length) {
			return 0;
		}
		int sa=arr[si]+sum(arr,si+1);
		return sa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int ans=sumOfArray(arr);
		System.out.println(ans);

	}

}

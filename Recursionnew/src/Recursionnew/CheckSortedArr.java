package Recursionnew;

import java.util.Scanner;

public class CheckSortedArr {

	public static boolean checkSorted(int arr[]) {
		return check(arr,0);
	}
public static boolean check(int arr[],int si) {
	if(si==arr.length-1) {
		return true;
	}
		if(arr[si]>arr[si+1]) {
			return false;
		}
		return check(arr,si+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		boolean ans=checkSorted(arr);
		System.out.println(ans);

	}

}

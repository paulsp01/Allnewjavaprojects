package Recursionnew;

import java.util.Scanner;

public class CheckNum {

	public static boolean checkNumArr(int arr[],int n) {
		return checkNum(arr,n,0);
	}
public static boolean checkNum(int arr[],int n,int si) {
	if(si==arr.length) {
		return false;
	}
	if(arr[si]==n) {
		return true;
	}
	return checkNum(arr,n,si+1);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		boolean ans=checkNumArr(arr,x);
		System.out.println(ans);

	}

}

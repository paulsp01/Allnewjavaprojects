package Recursionnew;

import java.util.Scanner;

public class FirstIndex {
public static int indexNum(int arr[],int x) {
	return index(arr,x,0);
}
public static int index(int arr[],int x,int si) {
	if(si==arr.length) {
		return -1;
	}
	if(arr[si]==x) {
		return si;
	}
	return index(arr,x,si+1);
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
		int ans=indexNum(arr,x);
		System.out.println(ans);

	}

}

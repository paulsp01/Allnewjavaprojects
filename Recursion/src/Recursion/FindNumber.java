package Recursion;

import java.util.Scanner;

public class FindNumber {
	public static int findNum(int[]arr,int x) {
	int n=arr.length;
	if(n==0) {
		return -1;
	}
	if(arr[0]==x) {
		return 0;
	}
	int[]smallArray=new int[arr.length-1];
	for(int i=0;i<arr.length;i++) {
		arr[i-1]=arr[i];
	}
	int smallSorted=findNum(smallArray,x);
	if(smallSorted==-1) {
		return -1;
	}else {
		return smallSorted+1;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		int ans=findNum(arr,x);

	}

}

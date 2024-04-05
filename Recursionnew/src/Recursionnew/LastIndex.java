package Recursionnew;

import java.util.Scanner;

public class LastIndex {
	public static int lastIndex(int arr[],int x) {
		return Index(arr,x,0);
	}
public static int Index(int arr[],int x,int si) {
	
	if(si==arr.length) {
		return -1;
	}
	int sa=Index(arr,x,si+1);
	if(sa!=-1) {
		return sa;
	}
	if(arr[si]==x) {
		return si;
	}else {
		return -1;
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
		int x=s.nextInt();
		int ans=lastIndex(arr,x);
		System.out.println(ans);

	}

}

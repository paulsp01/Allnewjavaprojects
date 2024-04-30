package TimeComplexity;

import java.util.Scanner;

public class FindLeaderArr {
	public static void leader(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]>max) {
		  System.out.print(arr[i]+" ");
          max=arr[i];
			
		}
		
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
		leader(arr);

	}

}

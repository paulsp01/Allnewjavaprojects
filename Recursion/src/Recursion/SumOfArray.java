package Recursion;

import java.util.Scanner;

public class SumOfArray {
public static int sumOfArray(int[]arr,int n) {
	
	if(n==0) {
		return 0;
	}
	return arr[n-1]+sumOfArray(arr,n-1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		System.out.println(sumOfArray(arr,n));

	}

}

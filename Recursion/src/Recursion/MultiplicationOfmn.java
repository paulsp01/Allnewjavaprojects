package Recursion;

import java.util.Scanner;

public class MultiplicationOfmn {
	public static int multiply(int m,int n) {
		if(n==0) {
			return 0;
		}
		int smallOutput=multiply(m,n-1);
		int ans=m+smallOutput;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int ans=multiply(m,n);
		System.out.println(ans);

	}

}

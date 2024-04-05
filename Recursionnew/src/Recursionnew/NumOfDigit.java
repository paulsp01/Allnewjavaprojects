package Recursionnew;

import java.util.Scanner;

public class NumOfDigit {
	public static int numOfDigit(int n) {
		if(n==0) {
			return 0;
		}
		
		
		int smallAns=numOfDigit(n/10);
		int ans=smallAns+1;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=numOfDigit(n);
		System.out.println(ans);

	}

}

package Recursion;

import java.util.Scanner;

public class SumOfDigit {
	public static int SumOfDigit(int n) {
		if(n<10) {
			return n;
		}
		int smallOutput=SumOfDigit(n/10);
		int ans=n%10+smallOutput;
		return ans;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int str=s.nextInt();
		int ans=SumOfDigit(str);
		System.out.println(ans);

	}

}

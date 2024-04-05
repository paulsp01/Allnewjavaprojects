package Recursionnew;

import java.util.Scanner;

public class PrintFirstNaturalNum {
	public static void firstNaturalNum(int n) {
		if(n==0) {
			return;
		}
		firstNaturalNum(n-1);
		System.out.println(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		firstNaturalNum(n);

	}

}

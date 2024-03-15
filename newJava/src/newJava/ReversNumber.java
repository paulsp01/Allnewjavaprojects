package newJava;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		while(n>0) {
		int t=n%10;
		 rev =rev*10+t;
		
		
        n=n/10;
	}
		System.out.println(rev);
	}

}

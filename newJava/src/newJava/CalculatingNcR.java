package newJava;

import java.util.Scanner;

public class CalculatingNcR {
	public static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*fact(n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int N=fact(n);
		int R=fact(r);
		int NR=fact(n-r);
		int ans=N/(R*(N-R));
		System.out.println(ans);
		

	}

}

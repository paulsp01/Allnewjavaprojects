package functions;

import java.util.Scanner;

public class FibbonaciSeries {
	public static boolean  fibbonaciNumber(int n) {
		int a=0;
		int b=1;
		int c=0;
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
			
		}
		if(c==n) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean ans=fibbonaciNumber(n);
           System.out.println(ans);
	}

}

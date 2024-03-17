package newJava;

import java.util.Scanner;

public class Probability {
	public static int fact(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}
	
	public static int NcR(int n,int r) {
		int ans=(fact(n)/(fact(r)*fact(n-r)));
		return ans;
	}
	
	public static int probab(int n,int x) {
		int ans=NcR(4,x)*NcR(4,n-x);
		float probab=ans*1.0f/NcR(8,n);
		return (int)(probab*100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int ans=probab(n,x);
		System.out.println(ans);

	}

}

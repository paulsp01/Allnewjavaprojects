package Recursion;

import java.util.Scanner;

public class calculatePower {
public static int calculatePower(int x,int n) {
	if(n==0) {
		return 1;
	}
	if(n==1) {
		return x;
	}
	int smallOutput=calculatePower(x,n-1);
	int ans =x*smallOutput;
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int ans=calculatePower(x,n);
		System.out.println(ans);

	}

}

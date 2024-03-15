package Recursion;

import java.util.Scanner;

public class GeometricSum {
public static double geometricSum(int k) {
	if(k==0) {
		return 1;
	}
	double smallOutput=geometricSum(k-1);
	double ans=1+0.5*smallOutput;
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		double ans=geometricSum(k);
		System.out.println(ans);

	}

}

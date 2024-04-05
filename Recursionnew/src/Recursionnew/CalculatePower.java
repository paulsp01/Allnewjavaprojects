package Recursionnew;

import java.util.Scanner;

public class CalculatePower {
public static int calculatePow(int x,int n) {
	if(n==0) {
		return 1;
	}
	 if(n==1){
         return x;
     }
	int smallOutput=calculatePow(x,n-1);
	int ans=x*smallOutput;
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int ans=calculatePow(x,n);
		System.out.println(ans);

	}

}

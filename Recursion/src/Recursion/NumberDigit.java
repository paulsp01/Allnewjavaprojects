package Recursion;

import java.util.Scanner;

public class NumberDigit {
public static int numberDigit(int n) {
	 if(n==0){
         return 0;
         
     }
     
     int  smalloutput=numberDigit(n/10);
     int ans=smalloutput+1;
     return ans;
     
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int ans=numberDigit(n);
		System.out.println(ans);

	}

}

package newJava;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean isPrime=true;
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
			}
			
			}

		if(isPrime) {
			System.out.print("number is  prime");
		}else {
			System.out.print("number is not prime");
		}
		

	}

}

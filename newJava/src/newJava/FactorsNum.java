package newJava;

import java.util.Scanner;

public class FactorsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		
		

	}

}

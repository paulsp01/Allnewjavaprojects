package newJava;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=10;i++) {
			int mul=n*i;
			System.out.println(mul);
			
		}
		

	}

}

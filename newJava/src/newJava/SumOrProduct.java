package newJava;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int sum=0;
		int mul=1;
		
			if(n==1) {
				for(int i=0;i<=x;i++) {
				sum=sum+i;
				}
				System.out.println(sum);
			}else if(n==2) {
				for(int i=1;i<=x;i++) {
					mul=mul*i;
					}
				System.out.println(mul);
				
			}
			
		}
		
		

}



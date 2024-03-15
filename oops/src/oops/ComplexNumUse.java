package oops;

import java.util.Scanner;

public class ComplexNumUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int real1=s.nextInt();
		int img1=s.nextInt();
		int real2=s.nextInt();
		int img2=s.nextInt();
		
		ComplexNum c1= new ComplexNum(real1,img1);
		ComplexNum c2=new ComplexNum(real2,img2);
		int choice=s.nextInt();
		if(choice==1) {
			c1.add(c2);
			c1.print();
		}else if(choice==2) {
			c1.multiply(c2);
			c1.print();
		}else {
			return;
		}
		s.close();
	}



	
	
}

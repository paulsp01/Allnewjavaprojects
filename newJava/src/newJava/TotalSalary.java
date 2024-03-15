package newJava;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int basic=s.nextInt();
		int allow;
		char grade=s.next().charAt(0);
		double hra=0.2*basic;
		double da=0.5*basic;
		double pf=0.11*basic;
		
		if(grade=='A') {
			allow=1700;
		}
		else if(grade=='B') {
			allow=1500;
		}else {
			allow=1300;
		}
		
		double total= (basic + hra + da + allow-pf);
		 int ans=(int) (Math.round(total));
			System.out.print(ans);

	}

}

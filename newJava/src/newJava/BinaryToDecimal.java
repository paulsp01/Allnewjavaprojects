package newJava;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int  dec=0;
		int pv=1;
		while(n!=0){
            int rem=n%10;
            dec=dec+(rem*pv);
            n=n/10;
            pv=pv*2;
        }
        System.out.println(dec);
		

	}

}

package newJava;

import java.util.Scanner;

public class FarenhiteToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int S=s.nextInt();
    int E=s.nextInt();
    int W=s.nextInt();
    
    
    while(S<=E) {
    	int C=((5*(S-32))/9);
    	
    
    System.out.println(S+" "+C);
    S+=W;
	}
	}
}

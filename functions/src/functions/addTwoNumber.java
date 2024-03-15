package functions;
import java.util.Scanner;

public class addTwoNumber {
	public static int addTwoNumber(int a,int b){
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=addTwoNumber(a,b);
	  System.out.print(c);
		
		
		

	}

}

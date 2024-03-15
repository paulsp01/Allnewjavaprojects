package functions;
import java.util.Scanner;

public class numberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int numstars=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
				}
			
			for(int star=1;star<=numstars;star++) {
				System.out.print("*");
			}
			for(int v=n-i+1;v>=1;v--) {
				System.out.print(v);
			}
			System.out.println();
			numstars=numstars+2;
		}
		

	}

}

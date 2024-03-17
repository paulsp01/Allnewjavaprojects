package newJava;

import java.util.Scanner;

public class MaximumNum {
	
	 public static int max_number(int n) {
		 int maximum=0;
		 int i=1;
		 while(n/i>0) {
			 int newNum=(n/(i*10))*i+n%i;
			 i=i*10;
			 if(newNum>maximum) {
				 maximum=newNum;
			 }
		 }
		 return maximum;
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=max_number(n);
		System.out.println(ans);
		
		

	}

}

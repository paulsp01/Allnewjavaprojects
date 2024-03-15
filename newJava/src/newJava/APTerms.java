package newJava;

import java.util.Scanner;

public class APTerms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int current=1;
		for(int c=1;c<=n;c++) {
			 int ans=(3*current+2);
				
               if(ans%4!=0) {
            	  
            	   System.out.println(ans);
               }else {
            	   c--;
               }
				
			current++;
		}

	}

}

package functions;

import java.util.Scanner;

public class MaximumNumber {
	public static int maximumNumber(int n) {
		int maxNum=0;
	    int i=1;
	    while(n/i>0) {
	    	int newNum=(n/(i*10))*i+n%i;
	    	i=i*10;
	    	if(maxNum<newNum) {
	    		maxNum=newNum;
	    	}
	    	
	    }
	    return maxNum;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int ans=maximumNumber(n);
      System.out.print(ans);
	}

}

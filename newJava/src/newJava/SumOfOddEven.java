package newJava;

import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int SOE=0,SOO=0;
        while(n!=0)
        {int t=n%10;
        if(t%2==0)
        {SOE+=t;}
         if(t%2!=0)
         {SOO+=t;}
         n=(int)(n/10);
        }
        System.out.println(SOE+" "+SOO);
	}
	

}

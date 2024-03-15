package functions;

import java.util.Scanner;

public class probability {
	public static int factorial(int number) {
		int ans=1;
		for(int i=1;i<=number;i++) {
			ans=ans*i;
			
		}
		return ans;
		
	}
	public static int ncr(int num,int r) {
		
		 int ans=factorial(num)/(factorial(num-r)*factorial(r));
		 return ans;
	}
	
	public static int probability(int n,int x) {
		int ans=ncr(4,x)*ncr(4,n-x);
		float probab=(ans*1.0f)/(ncr(8,n));
		int result=(int)(probab*100);
				return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int ans=probability(n,x);
		System.out.print(ans);
		

	}

}

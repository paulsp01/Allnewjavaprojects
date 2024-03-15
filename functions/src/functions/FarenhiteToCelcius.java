package functions;
import java.util.Scanner;

public class FarenhiteToCelcius {
	public static void farenhiteTocelcius(int s,int e,int w) throws negativeNumExeception {
		if(s==-1) {
			throw new negativeNumExeception();
		}
		for(int i=s;i<=e;i=i+w) {
			int ans=(int)(((i-32)*5)/9);
			System.out.println(i+"\t"+ans);
		}
	    
	}

	public static void main(String[] args) throws negativeNumExeception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		int w=sc.nextInt();
		farenhiteTocelcius( s, e, w);
		

	}

}

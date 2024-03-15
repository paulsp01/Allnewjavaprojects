package Recursion;

import java.util.Scanner;

public class pairStar {
	public static String pairStar(String str) {
		if(str.length()==1) {
			return str;
		}
		String out=pairStar(str.substring(1));
		if(str.charAt(0)==str.charAt(1)) {
			 out=str.charAt(0)+"*"+str.charAt(1)+out.substring(1);
		}else {
			out=str.charAt(0)+out;
		}
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=pairStar(str);
		System.out.println(ans);

	}

}

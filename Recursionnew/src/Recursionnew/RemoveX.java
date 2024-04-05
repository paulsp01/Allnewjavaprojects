package Recursionnew;

import java.util.Scanner;

public class RemoveX {
	public static String removeX(String str) {
		if(str.length()==0) {
			return str;
		}
		String sa=removeX(str.substring(1));
		if(str.charAt(0)=='x') {
			return sa;
		}else {
			return str.charAt(0)+sa;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=removeX(str);
		System.out.println(ans);

	}

}

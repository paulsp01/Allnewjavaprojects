package Recursionnew;

import java.util.Scanner;

public class ReplacePI {
	public static String replace(String str) {
		if(str.length()<=1) {
			return str;
		}
		
		if(str.charAt(0)=='p'&& str.charAt(1)=='i') {
			String sa=replace(str.substring(2));
			return "3.14"+sa;
		}else {
			String sa=replace(str.substring(1));
			return str.charAt(0)+sa;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=replace(str);
		System.out.println(ans);
	}

}

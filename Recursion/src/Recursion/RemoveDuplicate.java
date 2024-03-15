package Recursion;

import java.util.Scanner;

public class RemoveDuplicate {
	public static String removeDuplicate(String str) {
		if(str.length()==0) {
			return "";
		}
		if(str.length()==1) {
			return str;
		}
		String small=removeDuplicate(str.substring(1));
		if(small.charAt(0)==str.charAt(0)) {
			return small;
		}else {
			return str.charAt(0)+small;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=removeDuplicate(str);
		System.out.println(ans);

	}

}

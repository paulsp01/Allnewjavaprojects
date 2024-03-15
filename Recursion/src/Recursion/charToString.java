package Recursion;

import java.util.Scanner;

public class charToString {
	public static int StringToInt(String str) {
		if(str.length()==1) {
			return str.charAt(0)-'0';
		}
		int small=StringToInt(str.substring(0,str.length()-1));
		int lastDigit=str.charAt(str.length()-1)-'0';
		int ans=small*10+lastDigit;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int ans=StringToInt(str);
		System.out.println(ans);

	}

}

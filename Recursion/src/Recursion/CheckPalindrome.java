package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
public static boolean isPalindrome(String str) {
	if(str.length()<=1) {
		return true;
	}
	if(str.charAt(0)==str.charAt(str.length()-1)) {
		return isPalindrome(str.substring(1,str.length()-1));
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean ans=isPalindrome(str);
		System.out.println(ans);

	}

}

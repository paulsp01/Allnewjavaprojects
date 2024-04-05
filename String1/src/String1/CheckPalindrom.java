package String1;

import java.util.Scanner;

public class CheckPalindrom {
	public static boolean checkPalindrome(String str) {
		int pa=0;
		int pb=str.length()-1;
		
		while(pa<pb) {
			if(str.charAt(pa)==str.charAt(pb)) {
				return true;
			}
			pa++;
			pb--;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean ans=checkPalindrome(str);
		System.out.println(ans);
		
		

	}

}

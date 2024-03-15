package string;

import java.util.Scanner;

public class StringPalindrome {
	public static boolean checkPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean ans=checkPalindrome(str);
		System.out.println(ans);

	}

}

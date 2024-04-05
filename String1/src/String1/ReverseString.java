package String1;

import java.util.Scanner;

public class ReverseString {
	public static String reverseString(String str) {
		if(str.length()==0) {
			return null ;
		}
		if(str.length()==1) {
			return str;
		}
		String Reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			Reverse+=str.charAt(i);
		}
		return Reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans =reverseString(str);
		System.out.println(ans);

	}

}

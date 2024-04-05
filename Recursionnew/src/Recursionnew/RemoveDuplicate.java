package Recursionnew;

import java.util.Scanner;

public class RemoveDuplicate {
public static  String removeDuplicate(String str) {
	if(str.length()<=1) {
		return str;
	}
	String sa=removeDuplicate(str.substring(1));
	if(str.charAt(0)==sa.charAt(0)) {
		
				return sa;
	}else {
		return str.charAt(0)+sa;
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

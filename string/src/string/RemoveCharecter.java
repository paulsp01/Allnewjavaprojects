package string;

import java.util.Scanner;

public class RemoveCharecter {
	public static String removecharecter(String str,char x) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==x) {
				continue;
			}else {
				ans=ans+str.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char x=s.next().charAt(0);
		String ans=removecharecter(str,x);
		System.out.println((ans));
		

	}

}

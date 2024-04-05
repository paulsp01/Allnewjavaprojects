package String1;

import java.util.Scanner;

public class RemoveChar {

	public static String removeChar(String str,char x) {
		String res="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=x) {
				res+=str.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char x= s.next().charAt(0);
		String ans=removeChar(str,x);
		System.out.println(ans);
		

	}

}

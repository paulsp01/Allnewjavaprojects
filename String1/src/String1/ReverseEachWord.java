package String1;

import java.util.Scanner;

public class ReverseEachWord {
	public static String reverse(String str) {
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
		ans+=str.charAt(i);
		}
		return ans;
		
	}
	public static String reverseEachWord(String str) {
		
		String ans="";
		String word="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				ans+=reverse(word)+" ";
				word="";
			}
			
				word+=str.charAt(i);
		
		}
		ans+=reverse(word);
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=reverseEachWord(str);
		System.out.println(ans);

	}

}

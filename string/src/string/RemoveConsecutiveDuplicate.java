package string;

import java.util.Scanner;

public class RemoveConsecutiveDuplicate {
	public static String removeConsecutiveDuplicate(String str) {
		String res="";
		if(str.length()==0) {
			return str;
		}
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
				continue;
			}
			else {
				res+=str.charAt(i);
			}
			}
		return res;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=removeConsecutiveDuplicate(str);
		System.out.println(ans);

	}

}

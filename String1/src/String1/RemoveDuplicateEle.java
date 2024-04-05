package String1;

import java.util.Scanner;

public class RemoveDuplicateEle {
	public static String removeDuplicate(String str) {
		String c="";
		if(str.length()==0) {
			return str;
		}
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
				continue;
			}else {
				c=c+str.charAt(i);
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=removeDuplicate(str);
		System.out.println(ans);

	}

}

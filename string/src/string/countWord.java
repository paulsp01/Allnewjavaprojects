package string;

import java.util.Scanner;

public class countWord {
	public static int countWord(String str) {
		if(str.length()==0) {
			return 0;
		}
		int num=0;
		for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)==' '){
	                num++;
	            }
		}
		return num+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str==null) {
			str="";
		}
		int ans=countWord(str);
		System.out.println(ans);
		

	}

}

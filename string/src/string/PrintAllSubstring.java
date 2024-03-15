package string;

import java.util.Scanner;

public class PrintAllSubstring {
	public static void allSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.print(str.substring(i,j+1)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str==null) {
			str="";
		}
		allSubstring(str);

	}

}

package string;

import java.util.Scanner;

public class PrintAllSubstringTwo {
public static void AllSubstring(String str) {
	for(int len=1;len<=str.length();len++) {
		
		for(int start=0;start<=str.length()-len;start++) {
			int end=start+len-1;
			System.out.println(str.substring(start,end+1)+" ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str==null) {
			str="";
		}
		AllSubstring(str);

	}

}

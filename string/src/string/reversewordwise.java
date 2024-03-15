package string;

import java.util.Scanner;

public class reversewordwise {
	public static String reversewordwise(String str) {
		int end=str.length();
		int i=str.length()-1;
		String output="";
		for(;i>=0;i--) {
			if(str.charAt(i)==' ') {
			output=output+str.substring(i+1,end)+" ";
			end=i;
			}
		}
		output=output+str.substring(i+1,end);
		return output;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=reversewordwise(str);
		System.out.print(ans);

	}

}

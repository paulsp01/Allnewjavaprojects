package TimeComplexity;

import java.util.Scanner;

public class MinLengthWord {
	public static String minLengthWord(String str) {
		String arr[]=str.split(" ");
		String min=str;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()< min.length()) {
			min=arr[i];
			}
		}
		return min;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String ans=minLengthWord(str);
System.out.println(ans);
	}

}

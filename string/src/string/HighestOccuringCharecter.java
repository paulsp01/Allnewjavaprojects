package string;

import java.util.Scanner;

public class HighestOccuringCharecter {
	public static char highestOccuringCharecter(String str) {
		int n=str.length();
		int[] arr=new int[256];
		int maxFreq=0;
		for(int i=0;i<n;i++) {
			arr[str.charAt(i)]+=1;
		}
		char c='\0';
		for(int i=0;i<str.length();i++) {
			if(maxFreq<arr[str.charAt(i)]) {
				maxFreq=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ans=highestOccuringCharecter(str);
		System.out.println(ans);

	}

}

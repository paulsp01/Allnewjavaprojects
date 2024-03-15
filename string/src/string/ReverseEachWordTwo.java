package string;

import java.util.Scanner;

public class ReverseEachWordTwo {
	public static String reversEachWord(String str) {
		int p1=0;
		int p2=0;
		int[] arr=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				p2=i-1;
				
			}
			int temp=arr[i];
			arr[i]=arr[p2];
			arr[p2]=temp;
			p1++;
			p2--;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		String ans=reversEachWord(str);
		System.out.println(ans);

	}

}

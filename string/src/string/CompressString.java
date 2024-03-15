package string;

import java.util.Scanner;

public class CompressString {
	public static String getCompress(String str) {
		String ans="";
		int count=0;
		char ch=str.charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count+=1;
				
				
				
			}else {
				ans+=ch;
				if(count>1){
					
					ans+=count;
					count=1;
				}
				ch=str.charAt(i);
				
			}
			if(i==str.length()-1) {
				ans+=ch;
				if(count>1){
					
					ans+=count;
					count=1;
				}
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=getCompress(str);
		System.out.println(ans);

	}

}

package String1;

import java.util.Scanner;

public class CheckPermutation {
	public static boolean checkPermutation(String str1,String str2) {
		int arr[]=new int[256];
		for(int i=0;i<arr.length;i++) {
			int a=(int)(str1.charAt(i));
				arr[a]=arr[a]+1;
			}
		for(int j=0;j<str2.length();j++) {
			int b=(int)(str2.charAt(j));
			arr[b]=arr[b]-1;
		}
		for(int k=0;k<arr.length;k++) {
			if(arr[k]!=0) {
				return false;
			}
			
		}
		return true;
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		boolean ans=checkPermutation(str1,str2);
		System.out.println(ans);

	}

}

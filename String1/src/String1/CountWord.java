package String1;

import java.util.Scanner;

public class CountWord {
public static int countWord(String str) {
	int c=0;
	  if(str.length()==0)
          return 0;
	 
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			c++;
			
		}
	}
	return c+1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr= new Scanner(System.in);
		String str = sr.nextLine();
		if(str==null)
		{
			str="";
		}
int ans=countWord(str);
System.out.println(ans);
	}

}

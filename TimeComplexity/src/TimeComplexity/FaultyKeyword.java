package TimeComplexity;

import java.util.Scanner;

public class FaultyKeyword {
	public static boolean faultyKeyword(String name,String typed) {
		  if(name.length() > typed.length()) return false;
	        
	        int i = 0;
	        int j = 0;
	        
	        while(i != name.length() && j != typed.length()) {
	            if(name.charAt(i) == typed.charAt(j)) {
	                i++;
	                j++;
	            } else if(i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
	                j++;
	            } else {
	                return false;
	            }
	        }
	        
	        while(j < typed.length()) {
	            if(typed.charAt(j) != name.charAt(i - 1)) return false; 
	            j++;
	        }
	        
	        return i < name.length() ? false : true;
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		String t=s.nextLine();
		boolean ans=faultyKeyword(n,t);
		
		System.out.println(ans);

	}

}

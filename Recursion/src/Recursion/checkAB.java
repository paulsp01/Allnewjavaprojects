package Recursion;

import java.util.Scanner;

public class checkAB {
 public static boolean checkAB(String input) {
	  if(input.length() == 0){
          return true;
      }
      
    if(input.charAt(0) == 'a'){
        if(input.substring(1).length() > 1 && input.substring(1,3).equals("bb")){
            return checkAB(input.substring(3));
        }else{
             return checkAB(input.substring(1));
        }
    }
      return false;

 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean ans=checkAB(str);
		System.out.println(ans);

	}

}

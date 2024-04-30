package Stack;
import java.util.*;
public class balancedBracket {
	

	    static boolean isMatch(char ch1, char ch2){
	        if(ch1 == '(' && ch2 == ')') return true;
	        if(ch1 == '[' && ch2 == ']') return true;
	        if(ch1 == '{' && ch2 == '}') return true;
	        return false;
	    }

	    public static boolean isBalanced(String expression) {
	        
	        //Your code goes here
	          int top = -1;

	        char s[] = new char[expression.length()];

	        for (int i = 0; i < expression.length(); i++) {
	            s[i] = expression.charAt(i);
	        }

	        for(int i=0; i<expression.length(); i++){
	            if(top < 0 || !isMatch(s[top], s[i])){
	                top++;
	                s[top] = s[i];
	            }else{
	                top--;
	            }
	        }

	        return top == -1;
	    }
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

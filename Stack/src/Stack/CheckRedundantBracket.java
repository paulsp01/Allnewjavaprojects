package Stack;

import java.util.Stack;

public class CheckRedundantBracket {
	public static boolean find(char ch) {
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
				return true;
	}
	return false;
	}
	public static boolean CheckRedundantBracket(String expression) {
		  // return false;
	       Stack<Character> stk=new Stack<>();

	        int n=expression.length();
	        for(int i=0;i<n;i++){
	            char c=expression.charAt(i);
	            if(c=='(' || find(c)){
	                stk.push(c);
	            }
	            else if(c==')'){
	                int count=0;
	                while(stk.peek()!='('){
	                    count++;
	                    stk.pop();
	                }
	                if(count>0){
	                    stk.pop();
	                }else
	                    return true;
	            }
	        }
	        while(!stk.isEmpty()){
	            if(stk.peek()!='(')
	                stk.pop();
	            else
	                break;
	        }
	        if(stk.isEmpty())
	            return false;
	        else
	            return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

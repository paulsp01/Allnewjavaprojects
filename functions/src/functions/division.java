package functions;

public class division {
	
		public static int divideNumbers(int num,int deno){
		    if(deno==0){
		        return Integer.MIN_VALUE;
		    }
		    //System.out.println("Inside division function")
		    return num/deno;
		}
		public static void printDivisionResult(int num,int deno){
		    if(deno==0){
		        //Exit the function
		        System.out.println("Division by Zero is not allowed");
		        return;
		    }
		    System.out.println(num/deno);
		}

		    
		public static void main(String args[]) {
		    int num=12;
		    int deno=4;
		    printDivisionResult(num,deno);
		    //int result=divideNumbers(num,deno);
//		    if(result>0){
//		        
//		    }else{
//		        
//		    }
//		    System.out.println(result);
	}
	    }



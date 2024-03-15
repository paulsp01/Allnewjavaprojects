package Recursion;

public class PrintNnumber {
public static void naturalnum(int n) {
	if(n==0) {
		return ;
	}
	naturalnum(n-1);
	System.out.println(n+" ");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub                                                                                                                  

	}

}

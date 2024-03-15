package functions;
import java.util.Scanner;

public class returnArraySum {
	
	
	public static int  sumOfArray(int[] arr) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr=takeInput();
		int result=sumOfArray(arr);
		System.out.print(result);

	}

}

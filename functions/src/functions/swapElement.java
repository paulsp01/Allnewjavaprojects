package functions;

import java.util.Scanner;

public class swapElement {
   public static void swapNumber(int[] arr) {
	   int n=arr.length;
	   for(int i=0;i<n-1;i=i+2) {
		   
			   int temp=arr[i];
			   arr[i]=arr[i+1];
			   arr[i+1]=temp;
			  
		   
		   
		   
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		 swapNumber(arr);
		//System.out.print(ans);
		 for(int i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
		

	}

}

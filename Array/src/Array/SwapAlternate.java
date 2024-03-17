package Array;

import java.util.Scanner;

public class SwapAlternate {
	public static void swapAlternate(int arr[]) {
		int a=0;
		int b=a+1;
		int count=1;
		while(count<arr.length) {
			int temp=arr[a];
			arr[a]=arr[b];
			arr[b]=temp;
			a=a+2;
			b=b+2;
			count=count+2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		swapAlternate(arr);
		 for(int i=0;i<n;i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println();

	}

}

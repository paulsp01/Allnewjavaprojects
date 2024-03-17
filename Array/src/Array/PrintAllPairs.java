package Array;

import java.util.Scanner;

public class PrintAllPairs {
public static void printAllPair(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			System.out.println(arr[i]+","+arr[j]);
		}
			
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		printAllPair(arr);
	}

}

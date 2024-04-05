package Array;

import java.util.Scanner;

public class SecondLargestArray {
	public static int secondLargeNum(int arr[]) {
		int firstLarge=Integer.MIN_VALUE;
		int secLarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLarge) {
				
				secLarge=firstLarge;
				firstLarge=arr[i];
				
			}
			 if(arr[i]>secLarge&&arr[i]<firstLarge){
				 secLarge=arr[i];
	             }
		}
		return secLarge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
		}
		int ans=secondLargeNum(arr);
		System.out.println(ans);

	}

}

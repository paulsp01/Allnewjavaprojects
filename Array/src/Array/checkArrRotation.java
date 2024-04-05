package Array;

import java.util.Scanner;

public class checkArrRotation {
	public static int checkArrRotation(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				
				return i+1;
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int ans=checkArrRotation(arr);
		System.out.println(ans);

	}

}

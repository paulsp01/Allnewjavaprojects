package arraysearch;

import java.util.Scanner;

public class rotationCheckingNumber {
	public static int rotation(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				return (i+1);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int ans=rotation(arr);
		System.out.print(ans);

	}

}

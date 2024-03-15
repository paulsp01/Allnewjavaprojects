package arraysearch;

import java.util.Scanner;

public class SecondLargest {
	public static int secondLarge(int[] arr) {
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>l) {
				sl=l;
				l=arr[i];
				
				
			}
			 if(arr[i]>sl&&arr[i]<l){
	                sl=arr[i];
	             }
		}
		return sl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int ans=secondLarge(arr);
		System.out.println(ans);

	}

}

package Array;

import java.util.Scanner;

public class FindDuplicate {
	public static int findDuplicate(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						return arr[i];
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int ans=findDuplicate(arr);
		System.out.println(ans);

	}

}

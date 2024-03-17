package Array;

import java.util.Scanner;

public class intersectionOfTwoArray {
	public static void intersectionArray(int[]arr1,int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" "); 
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		int m=s.nextInt();
		int arr2[]=new int[m];
		for(int j=0;j<m;j++) {
			arr2[j]=s.nextInt();
		}
		intersectionArray(arr1,arr2);
		

	}

}

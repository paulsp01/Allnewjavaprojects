package arraysearch;

import java.util.Scanner;

public class sumOfBoundary {
	public static int boundarySum(int[][]arr,int d) {
		int sum=0;
		for(int i=0;i<d;i++) {
			sum=sum+arr[0][i];
			sum=sum+arr[d-1][i];
			
		}
		for(int i=1;i<d-1;i++) {
			sum=sum+arr[i][0];
			sum=sum+arr[i][d-1];
			
		}
		for(int i=1;i<d-1;i++) {
			sum=sum+arr[i][i];
			sum=sum+arr[i][d-1-i];
			
		}
		for(int i=1;i<d-1;i++) {
			sum=sum+arr[i][i];
			sum=sum+arr[i][d-1-i];
			
		}
		if(d%2!=0) {
			sum=sum-arr[d/2][d/2];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array1 size");
		int m=s.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<m;i++) {
			System.out.println("enter "+(i+1)+"th element");
			arr1[i]=s.nextInt();
		}
		System.out.println("enter array2 size");
		int n=s.nextInt();
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter "+(i+1)+"th element");
			arr2[i]=s.nextInt();
		}

	}

}

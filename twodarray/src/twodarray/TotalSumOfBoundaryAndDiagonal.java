package twodarray;

import java.util.Scanner;

public class TotalSumOfBoundaryAndDiagonal {
	public static int totalSumOfBoundaryAndDiagonal(int arr[][]) {
		int d=arr.length;
		
		int sum=0;
		for(int i=0;i<d;i++) {
			sum+=arr[0][i];
			sum+=arr[d-1][i];
					
		}
		for(int i=1;i<d-1;i++) {
			sum+=arr[i][0];
			sum+=arr[i][d-1];
		}
		for(int i=1;i<d-1;i++) {
			sum+=arr[i][i];
			sum+=arr[i][d-1-i];
		}
		if(d%2!=0) {
			sum=sum-arr[d/2][d/2];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int ans=totalSumOfBoundaryAndDiagonal(arr);
		System.out.println(ans);

	}

}

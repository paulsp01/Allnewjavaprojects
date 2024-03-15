package dimentionalArray;

import java.util.Scanner;

public class sumOfBoundary {
	public static int boundarySum(int[][]arr) {
		int d=arr.length;;
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
		
		if(d%2!=0) {
			sum=sum-arr[d/2][d/2];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter row number");
		int row=s.nextInt();
		System.out.println("enter col number");
		int col=s.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter"+(i+1)+"row"+(j+1)+"col");
				arr[i][j] =s.nextInt();
				
			}
		}
		int ans=boundarySum(arr);
		System.out.println(ans);

	}

}

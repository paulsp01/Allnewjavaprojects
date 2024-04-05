package twodarray;

import java.util.Scanner;

public class largestRowCol {
public static void findLarge(int mat[][]) {
	boolean isRow=true;
	int largestSum=Integer.MIN_VALUE;
	int num =0;
	int nRow=mat.length;
	int nCol=mat[0].length;
	
	if(nRow==0) {
		System.out.println("row"+num+" "+largestSum);
		return;
	}
	for(int i=0;i<nRow;i++) {
		int sum=0;
		for(int j=0;j<nCol;j++) {
			sum=sum+mat[i][j];
		}
		if(sum>largestSum) {
			largestSum=sum;
			num=i;
		}
	}
	for(int j=0;j<nCol;j++) {
		int sum=0;
		for(int i=0;i<nRow;i++) {
			sum=sum+mat[i][j];
		}
		if(sum>largestSum) {
			largestSum=sum;
			num=j;
			isRow=false;
		}
	}
	if(isRow) {
		System.out.println("row"+" "+num+" "+largestSum);
	}else {
		System.out.println("col"+" "+num+" "+largestSum);
	}
}
	public static void main(String[] args) {
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
		findLarge(arr);

	}

}

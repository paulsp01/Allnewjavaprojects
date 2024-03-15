package dimentionalArray;

import java.util.Scanner;

public class SpiralPrint {
	public static void spiralPrint(int[][]arr) {
		int nRow=arr.length;
		if(nRow==0) {
			return;
		}
		int count=0;
		int mCol=arr[0].length;
		int numElement=nRow*mCol;
		int i;
		int rowStart=0 ,colStart=0;
		while(count<numElement) {
			for( i=colStart;count<numElement&&i<mCol;++i) {
				System.out.print(arr[rowStart][i]+" ");
				count++;
				
			}
			rowStart++;
			
			for( i=rowStart;count<numElement&&i<nRow;++i) {
				System.out.print(arr[i][mCol-1]+" ");
				count++;
				
			}
			mCol--;
			for( i=mCol-1;count<numElement&&i>=colStart;--i) {
				System.out.print(arr[nRow-1][i]+" ");
				count++;
				
			}
			nRow--;
			for( i=nRow-1;count<numElement&&i>=rowStart;--i) {
				System.out.print(arr[i][colStart]+" ");
				count++;
				
			}
			colStart++;
		}
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
		spiralPrint(arr);

	}

}

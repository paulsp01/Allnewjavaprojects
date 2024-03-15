package dimentionalArray;

import java.util.Scanner;

public class largestRowOrColumn {
	
	public static void rowColWiseSum(int[][] arr) {
		int largest=Integer.MIN_VALUE;
		boolean isRow=true;
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			int rsum=0;
			for(int j=0;j<arr[0].length;j++) {
				rsum=rsum+arr[i][j];
				
				
			}
			if(rsum>largest) {
				largest=rsum;
				index=i;
				isRow=true;
			}
		}
			for(int k=0;k<arr[0].length;k++) {
				int csum=0;
				for(int l=0;l<arr.length;l++) {
					csum=csum+arr[k][l];
					
					
				}
				if(csum>largest) {
					largest=csum;
					index=k;
					isRow=false;
				}
			}
				if(isRow) {
					System.out.println("largest row is"+index+""+largest);
				}else {
					System.out.println("largest col is"+index+""+largest);
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
			rowColWiseSum(arr);
			
			
				
			

		}

	}




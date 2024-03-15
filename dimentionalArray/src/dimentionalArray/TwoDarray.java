package dimentionalArray;

import java.util.Scanner;

public class TwoDarray {
	
public static void rowWiseSum(int[][] arr) {
	
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<arr[0].length;j++) {
			sum=sum+arr[i][j];
		}
		System.out.print(sum+" ");
	}
	System.out.println();
	
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
		rowWiseSum(arr);
		
		
			
		

	}

}

package dimentionalArray;

import java.util.Scanner;

public class printWave {
	public static void wavePrint(int[][]arr) {
		for(int j=0;j<arr[0].length;j++) {
		if(j%2==0) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i][j]);
			}
		}else {
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i][j]);
			}
		}
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
		wavePrint(arr);

	}

}

package twodarray;

import java.util.Scanner;

public class PrintSpiral {
	
	    public static void printSpiral(int arr[][]) {
	        int nRow = arr.length;
	        int nCol = arr[0].length;
	        int ele = nRow * nCol;
	        int rowLow = 0;
	        int rowUp = nRow - 1;
	        int colLow = 0;
	        int colUp = nCol - 1;
	        while (ele > 0) {
	            for (int i = colLow; i <= colUp; i++) {
	                System.out.print(arr[rowLow][i] + " ");
	                ele--;
	            }
	            rowLow++;
	            for (int i = rowLow; i <= rowUp; i++) {
	                System.out.print(arr[i][colUp] + " ");
	                ele--;
	            }
	            colUp--;
	            if (rowLow <= rowUp) { // Ensure rowUp hasn't crossed rowLow
	                for (int i = colUp; i >= colLow; i--) {
	                    System.out.print(arr[rowUp][i] + " ");
	                    ele--;
	                }
	                rowUp--;
	            }
	            if (colLow <= colUp) { // Ensure colUp hasn't crossed colLow
	                for (int i = rowUp; i >= rowLow; i--) {
	                    System.out.print(arr[i][colLow] + " ");
	                    ele--;
	                }
	                colLow++;
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
		printSpiral(arr);

	}

}

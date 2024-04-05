package Array;

import java.util.Scanner;

public class SortZeroOneTwo {
	public static void zeroOneTwo(int arr[]) {
		int i=0;
		int	index0=0;
		int index2=arr.length-1;
		while(i<=index2) {
			if(arr[i]==0) {
				int temp=arr[index0];
				arr[index0]=arr[i];
				arr[i]=temp;
				i++;
				index0++;
			}else if(arr[i]==2) {
				int temp=arr[index2];
				arr[index2]=arr[i];
				arr[i]=temp;
				
				index2--;
			}else {
				i++;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		zeroOneTwo(arr);
		 for(int i=0;i<n;i++) {
        	 System.out.print(arr[i]+" ");
         }
         System.out.println();
	}

}

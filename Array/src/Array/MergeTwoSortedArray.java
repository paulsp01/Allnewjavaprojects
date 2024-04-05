package Array;

import java.util.Scanner;

public class MergeTwoSortedArray {
	public static int[] mergeTwoSortedArray(int arr1[],int arr2[]) {
		int m=arr1.length;
		int n=arr2.length;
		int arr3[]=new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		while(i<m&&j<n) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<m) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		return arr3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++) {
			arr1[i]=s.nextInt();
		}
		int n=s.nextInt();
		int arr2[]=new int[n];
		for(int j=0;j<n;j++) {
			arr2[j]=s.nextInt();
		}
         int arr3[]=new int[m+n];
        arr3= mergeTwoSortedArray(arr1,arr2);
         for(int i=0;i<m+n;i++) {
        	 System.out.print(arr3[i]+" ");
         }
         System.out.println();
	}

}

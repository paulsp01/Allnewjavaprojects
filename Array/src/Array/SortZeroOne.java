package Array;

import java.util.Scanner;

public class SortZeroOne {

	public static void sortZeroOne(int arr[]) {
	int	index1=0;
	int index2=arr.length-1;
	while(index1<=index2) {
		if(arr[index2]==0) {
			int temp=arr[index2];
			arr[index2]=arr[index1];
			arr[index1]=temp;
			index1++;
		}else {
			index2--;
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
             sortZeroOne(arr);
             for(int i=0;i<n;i++) {
            	 System.out.print(arr[i]+" ");
             }
             System.out.println();
	}

}

package functions;

import java.util.Scanner;

public class sortArray {
	public static void sortArray(int[] arr){
		int n=arr.length;
		int left=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				int temp=arr[left];
				arr[left]=arr[i];
				arr[i]=temp;
				left++;
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		sortArray(arr);
		 for(int i=0;i<n;i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
		

	}

}

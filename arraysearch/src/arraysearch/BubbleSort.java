package arraysearch;
import java.util.Scanner;


public class BubbleSort {
	
		public static void printArray(int[] arr) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		public static void bubbleSort(int[] arr) {
			int n=arr.length;
			
			for(int i=0;i<n-1;i++) {
				
				for(int j=0;j<n-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
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
			
			
			bubbleSort(arr);
			printArray(arr);
			
		}

	}



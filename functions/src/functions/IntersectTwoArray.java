package functions;

import java.util.Scanner;

public class IntersectTwoArray {

	public static void  intersectArray(int[] arr1,int[] arr2) {
		int n=arr1.length;
		int k=arr2.length;
		int j;
		for(int i=0;i<n;i++) {
			for( j=0;j<k;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]);
					 arr2[j]= Integer.MIN_VALUE;
				}
				
			}
			
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array1: ");
        int size1 = scanner.nextInt();
        

        // Create an array of the specified size
        int[] arr1 = new int[size1];
        

        // Ask the user to enter elements for the array
        System.out.println("Enter the elements of the array1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of the array2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
       
        
        
        System.out.println("Enter the elements of the array2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }

        // Ask the user for the element to search
       
        // Call linearSearch function
        intersectArray(arr1,arr2);
     // Check the result and print the appropriate message
       
        // Close the Scanner
        scanner.close();
    }


}

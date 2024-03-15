package functions;

import java.util.Scanner;

public class findDuplicate {

	public static int  findDuplicate(int[] arr) {
		int n=arr.length;
		int j;
		for(int i=0;i<n;) {
			for( j=0;j<n;) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						return arr[i];
					}
				}
				j=j+1;
			}
			
			i=i+1;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        // Ask the user to enter elements for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Ask the user for the element to search
       
        // Call linearSearch function
        int result = findDuplicate(arr);
     // Check the result and print the appropriate message
        if (result == -1) {
            System.out.println("no duplicate element present ");
        } else {
            System.out.println("duplicate element present"+result);
        }

        // Close the Scanner
        scanner.close();
    }


}

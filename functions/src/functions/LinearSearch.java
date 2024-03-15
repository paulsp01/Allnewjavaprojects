package functions;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
        // Create a Scanner object for user input
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
        System.out.print("Enter the element to search for: ");
        int x = scanner.nextInt();

        // Call linearSearch function
        int result = linearSearch(arr, x);
     // Check the result and print the appropriate message
        if (result == -1) {
            System.out.println("Element " + x + " not found in the array.");
        } else {
            System.out.println("Element " + x + " found at index " + result + " in the array.");
        }

        // Close the Scanner
        scanner.close();
    }

    public static int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
    

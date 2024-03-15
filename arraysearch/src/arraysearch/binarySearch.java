package arraysearch;

import java.util.Scanner;

public class binarySearch {
	
	  public static int binarySearch(int[] arr, int s, int e, int x) {
	        while (s <= e) {
	            int mid = (s + e) / 2;

	            if (arr[mid] < x) {
	                s = mid + 1;
	            } else if (arr[mid] > x) {
	                e = mid - 1;
	            } else if (arr[mid] == x) {
	                return mid;
	            }
	        }
	        return -1;
	    }


	  public static void main(String[] args) {
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

	        // Call binarySearch function
	        int result = binarySearch(arr, 0, size - 1, x);

	        // Check the result and print the appropriate message
	        if (result == -1) {
	            System.out.println("Element " + x + " not found in the array.");
	        } else {
	            System.out.println("Element " + x + " found at index " + result + " in the array.");
	        }

	        // Close the Scanner
	        scanner.close();
	  }



}

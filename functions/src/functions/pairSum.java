package functions;

import java.util.Scanner;

public class pairSum {

	public static int  pairSum(int[] arr,int x) {
		int n=arr.length;
		int s=0;
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                s=arr[i]+arr[j];
                if(s==x){
                    
                    c++;
                
                }
                else{
                    continue;
                }
            }
        }
       
        return c;
		
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
        int x=scanner.nextInt();
        

        // Ask the user for the element to search
       
        // Call linearSearch function
        int result=pairSum(arr,x);
     // Check the result and print the appropriate message
       System.out.print(result);
        // Close the Scanner
        scanner.close();
    }
}

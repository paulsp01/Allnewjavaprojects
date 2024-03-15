package functions;
import java.util.Scanner;

public class ArrangeNumber {
	public static void arrangeNum(int[] arr,int n) {
		 n=arr.length;
		 int left = 0;
	        int right = n - 1;
	        int counter = 1;
	        while (left <=right)
	        {
	            if(counter % 2 == 1)
	            {
	                arr[left] = counter;
	                counter += 1;
	                left += 1;
	            }
	            else
	            {
	                arr[right] = counter;
	                counter += 1;
	                right -= 1;
	            }
	        }
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		arrangeNum(arr,n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}

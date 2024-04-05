package Array;

import java.util.Scanner;

public class PushZeroToEnd {
public static void pushZeroToEnd(int arr[]) {
	int c=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp=arr[i];
			arr[i]=arr[c];
			arr[c]=temp;
			c++;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		pushZeroToEnd(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
  System.out.println();
	}

}

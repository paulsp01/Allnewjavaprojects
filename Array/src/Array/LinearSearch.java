package Array;

import java.util.Scanner;

public class LinearSearch {
 public static int linearSearch(int arr[],int x) {
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==x) {
			 return i;
		 }
	 }
	 return -1;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=s.nextInt();
    }
    int x=s.nextInt();
    int ans=linearSearch(arr,x);
    System.out.println(ans);
	}

}

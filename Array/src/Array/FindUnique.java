package Array;

import java.util.Scanner;

public class FindUnique {
	public static int findUnique(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int j;
			for( j=0;j<n;j++) {
				if(i!=j) {
				if(arr[i]==arr[j]) {
					break;
				}
				}
			}
			 if(j==n) {
				return arr[i];
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
     int ans=findUnique(arr);
      System.out.println(ans);
	}

}

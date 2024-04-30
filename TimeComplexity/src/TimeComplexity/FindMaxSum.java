package TimeComplexity;

import java.util.Scanner;

public class FindMaxSum {
	public static int findMaxSum(int arr[],int k) {
		int n=arr.length;
		int cs=0;
		for(int i=0;i<k;i++) {
			cs+=arr[i];
		}
		int maxSum=cs;
		for(int i=k;i<n;i++) {
			cs=cs-arr[i-k]+arr[i];
			maxSum=Math.max(maxSum, cs);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		int ans=findMaxSum(arr,k);
		System.out.println(ans);

	}

}

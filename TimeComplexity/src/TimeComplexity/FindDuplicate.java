package TimeComplexity;

import java.util.Scanner;

public class FindDuplicate {
public static int findDuplicate(int[]arr) {
	int ts=0;
	int n= arr.length;
	for(int i=0;i<n;i++) {
		ts+=arr[i];
	}
	int sum2=((n-2)*(n-1))/2;
	int sub=ts-sum2;
	return sub;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int ans=findDuplicate(arr);
		System.out.println(ans);


	}

}

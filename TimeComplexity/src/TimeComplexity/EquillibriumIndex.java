package TimeComplexity;

import java.util.Scanner;

public class EquillibriumIndex {
public static int EquillibriumIndex(int[] arr) {
	int ts=0;
	int ls=0;
	int n=arr.length;;
	for(int i=0;i<n;i++) {
		ts+=arr[i];
		
		
	}
	 
	for(int j=0;j<n;j++) {
		int rs=ts-ls-arr[j];
		
		if(ls==rs) {
			return j;
		}
		ls+=arr[j];
		
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int ans=EquillibriumIndex(arr);
		System.out.println(ans);

	}

}

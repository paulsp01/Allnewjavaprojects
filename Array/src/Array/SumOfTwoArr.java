package Array;

import java.util.Scanner;

public class SumOfTwoArr {
	public static void sumOfTwoArr(int arr1[],int arr2[],int output[]) {
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=Math.max(arr1.length, arr2.length);
		int c=0;
		
		while(i>=0&&j>=0) {
			int sum=arr1[i]+arr2[j]+c;
			
			output[k]=sum%10;
			c=sum/10;;
			i--;
			j--;
			k--;
			
		}
		
		while(i>=0) {
			int sum=arr1[i]+c;
			
			output[k]=sum%10;
			c=sum/10;
			i--;
			k--;
			
		}
		while(j>=0) {
			int sum=arr2[j]+c;
			
			output[k]=sum%10;
			c=sum/10;
			j--;
			k--;
		}
		output[0]=c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++) {
			arr1[i]=s.nextInt();
			
			
		}
		int n=s.nextInt();
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=s.nextInt();
			
			
		}
		 int output[] = new int[Math.max(n,m) + 1]; 
		sumOfTwoArr(arr1,arr2,output);
		 for(int i = 0 ;i < output.length ;i++)
 	    {
 	        System.out.print(output[i]+" ");
 	    }
 	    System.out.println();

	}

}

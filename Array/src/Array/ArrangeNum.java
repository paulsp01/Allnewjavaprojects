package Array;

import java.util.Scanner;

public class ArrangeNum {
	public static void arrangeNum(int n,int arr[]) {
		int left=0;
		int right=n-1;
		int count=1;
		while(left<=right) {
			if(count%2==1) {
				arr[left]=count;
				count++;
				left++;
			}else {
				arr[right]=count;
				count++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		arrangeNum(n,arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}

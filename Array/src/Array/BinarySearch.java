package Array;

import java.util.Scanner;

public class BinarySearch {
public static int binarySerch(int nums[],int target) {
	   int s=0;
       int e=nums.length-1;
       
       while(s<=e){
           int mid=(s+e)/2;
           if(nums[mid]>target){
               e=mid-1;
           }else if(nums[mid]<target){
               s=mid+1;
           }
           else{
               return mid;
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
		int ans=binarySerch(arr,x);
		System.out.println(ans);

	}

}

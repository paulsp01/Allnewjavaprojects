package Recursion;

import java.util.Scanner;

public class CheckNumber {
	public static boolean checkNum(int[]arr,int x,int start) {
		  if(start==arr.length){
	            return false;
	        }
	        if(arr[start]==x){
	            return true;
	        }
	        return checkNum(arr,x,start+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		System.out.println(checkNum(arr,x,0));


	}

}

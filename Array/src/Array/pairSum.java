package Array;

import java.util.Scanner;

public class pairSum {
	 	public static int pairSum(int arr[], int x) {
	        //Your code goes here
	        int s=0;
	        int c=0;
	        for(int i=0;i<arr.length-1;i++){
	            for(int j=i+1;j<arr.length;j++){
	                s=arr[i]+arr[j];
	                if(s==x){
	                    
	                    c++;
	                
	                }
	                else{
	                    continue;
	                }
	            }
	        }
	       
	        return c;
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
		int ans=pairSum(arr,x);
		System.out.println(ans);
		

	}

}

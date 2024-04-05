package Recursionnew;

import java.util.Scanner;

public class QuickSort {
	  public static int partition(int[]input,int si, int ei){
	        int pivotElement=input[si];
	        int smallNumCount=0;
	        for(int i=si+1;i<=ei;i++){
	            if(input[i]<pivotElement){
	                smallNumCount++;
	            }
	        }
	            int t=input[si+smallNumCount];
	            input[si+smallNumCount]=pivotElement;
	            input[si]=t;
	        int i=si;
	        int j=ei;
	        while(i<j){
	            if(input[i]<pivotElement){
	                i++;
	            }else if(input[j]>=pivotElement){
	                j--;
	            }
	            else{
	                int ti=input[i];
	                input[i]=input[j];
	                input[j]=ti;
	                i++;
	                j--;
	            }
	            
	        }
	        return si+smallNumCount;
	    }
	  public static void quickSort(int[]input,int si, int ei){
	        if(si>=ei){
	            return;
	        }
	        int pivotIndex=partition(input,si,ei);
	        quickSort(input,si,pivotIndex-1);
	        quickSort(input,pivotIndex+1,ei);
	    }
	  public static void quickSort(int[] input) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * No need to print or return the output.
			 * Taking input and printing output is handled automatically.
			 */
			if(input.length==0){
	            return;
	        }
	        quickSort(input,0,input.length-1);
		}
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int[] arr=new int[n];
	      for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
				}
	     
	      quickSort(arr);
	      for(int i=0;i<arr.length;i++){
	            System.out.println(arr[i]);
	        }
	}

}

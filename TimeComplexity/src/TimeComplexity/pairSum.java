package TimeComplexity;

import java.util.Scanner;
import java.util.*;

public class pairSum {
	public static int pairSum(int arr[], int num) {
		Arrays.sort(arr);
		int si=0;
		int ei=arr.length-1;
		int np=0;
		while(si<ei) {
			if(arr[si]+arr[ei]<num) {
				si++;
			}else if(arr[si]+arr[ei]>num) {
				ei--;
			}else {
				int elemAtStart=arr[si];
				int eleAtEnd=arr[ei];
				if(elemAtStart==eleAtEnd) {
					int totalElementFromStartToEnd=(ei-si)+1;
					np+=(totalElementFromStartToEnd*(totalElementFromStartToEnd-1)/2);
					return np;
					
				}
				
				int tempEleSi=si+1;
				int tempEleEi=ei-1;
				while(tempEleSi<=tempEleEi&& arr[tempEleSi]==elemAtStart) {
					tempEleSi++;
				}
				while(tempEleEi>=tempEleSi&& arr[tempEleEi]==eleAtEnd) {
					tempEleEi--;
				}
				int tempEleFromSi=tempEleSi-si;
				int tempEleFromEi=ei-tempEleEi;
				np+=(tempEleFromSi*tempEleFromEi);
				si=tempEleSi;
				ei=tempEleEi;
			}
		}
		return np;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			 arr[i]=s.nextInt();
		}
		
		int num=s.nextInt();
		
		int ans=pairSum(arr,num);
		System.out.println(ans);
		

	}

}

package Recursion;

public class QuickSort {
	
	public static int partition(int[]a,int si,int ei) {
		int pivotElement=a[si];
		int smallCount=0;
		for(int i=si+1;i<=ei;i++) {
			if(a[si]<pivotElement) {
			smallCount++;
			}
		}
		int temp=a[si+smallCount];
		a[si+smallCount]=a[si];
		a[si]=temp;
		int i=si;
		int j=ei;
		while(i<j){
			if(a[i]<pivotElement) {
				i++;
			}else if(a[j]>=pivotElement){
				j--;
			}else {
				 temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
				
			}
		}
		return si+smallCount;
		
		
	}
	public static void quickSort(int[]arr,int si,int ei) {
		if(si>ei) {
			return; 
					
		}
		int pivotIndex=partition(arr,si,ei);
		quickSort(arr,si,pivotIndex-1);
		quickSort(arr,pivotIndex+1,ei);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

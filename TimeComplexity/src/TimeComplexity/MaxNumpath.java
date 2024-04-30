package TimeComplexity;
import java.lang.Math;

public class MaxNumpath {
	public static long maxNumpath(int input1[],int input2[]) {
		   int i=0,j=0;
	        int res=0 ,sum1=0,sum2=0;
	        int m=input1.length;
	        int n=input2.length;
	        while(i<m&&j<n){
	            if(input1[i]<input2[j]){
	                sum1+=input1[i++];
	            }else if(input1[i]>input2[j]){
	                sum2+=input2[j++];
	            }
	            else{
	                res+=Math.max(sum1,sum2);
	                sum1=0;sum2=0;
	                int t=i;
	                while(i<m&&input1[i]==input2[j])
	                    sum1+=input1[i++];
	                while(j<n&&input1[t]==input2[j])
	                    sum2+=input2[j++];
	                res+=Math.max(sum1,sum2);
	                sum1=0;
	                		sum2=0;
	            }
	        }
	        while(i<m)
	            sum1+=input1[i++];
	        while(j<n)
	            sum2+=input2[j++];
	        res+=Math.max(sum1,sum2);
			return res;
		}
		



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

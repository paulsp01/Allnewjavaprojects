package LinkedLisetNew;

public class mat {

	int [][] matrix;
	
	 mat(int [][] mat)
	{
		matrix=mat;
	}
		
	
	    public static mat add(mat a,mat b)
	    {
	    	int ans[][]=new int[a.matrix.length][a.matrix[0].length];
	    	for(int i=0;i<a.matrix.length;i++) {
	    		for(int j=0;j<a.matrix[0].length;j++) {
	    			ans [i][j]=a.matrix[i][j]+b.matrix[i][j];
	    		}
	    	}
	    	mat answer=new mat(ans);
	    	return answer;
	      
	    }
	    public static mat multiply(mat a,mat b)
	    {
	    	int ans[][]=new int[a.matrix.length][b.matrix[0].length];
	    	for(int i=0;i<a.matrix.length;i++) {
	    		for(int j=0;j<b.matrix[0].length;j++) {
	    			for(int k=0;k<a.matrix[0].length;k++) {
	    			ans [i][j]+=a.matrix[i][k]*b.matrix[k][j];
	    			}
	    		}
	    	}
	    	mat answer=new mat(ans);
	    	return answer;
	      
	    }
	    public static mat transpose(mat m)
	    {
	    	int ans[][]=new int[m.matrix.length][m.matrix .length];
	    	for(int i=0;i<m.matrix.length;i++) {
	    		for(int j=0;j<m.matrix.length;j++) {
	    			ans [i][j]=m.matrix[j][i];
	    		}
	    	}
	    	mat answer=new mat(ans);
	    	return answer;
	    	
	    }
	    public static mat rotate(mat m)
	    {
	    	int c=m.matrix.length;
	    	int r=m.matrix[0].length;
	    	int ans[][]=new int[c][r];
	    	for(int i=0;i<r;i++) {
	    		for(int j=0;j<c;j++) {
	    			ans[c-j-1][i]=m.matrix[i][j];
	    		}
	    	}
	    	
	    	mat answerR=new mat(ans);
			return answerR;
	    	
			
	    	
	    }
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package javaProject;

import java.util.Scanner;

public class StrangeIsland {
  public static String[] map;
  public static char[][] newmap=new char[12][12];
  public static int[] u= {0,0,1,-1};
  public static int[] v= {1,-1,0,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj=new Scanner(System.in);
		int r=myObj.nextInt();
		int s=myObj.nextInt();
		map=new String[r];
		int mini=100;
		int maxi=0;
		int minj=100;
		int maxj=-0;
		for(int i=0;i<r;i++) {
			map[i]=myObj.next();
		}
		for(int i=0;i<r;++i) {
			for(int j=0;j<s;++j) {
				int more=0;
				for(int k=0;k<4;++k) {
					int x=i+u[k];
					int y=j+v[k];
					if(x<0||y<0||x>=r||y>=s||map[x].charAt(y)=='.') {
						more++;
					}
				}
			}
		}
		

	}

}

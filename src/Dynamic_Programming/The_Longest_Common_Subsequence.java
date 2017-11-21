package Dynamic_Programming;

import java.util.*;

public class The_Longest_Common_Subsequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[m + 1];
		int[][] c = new int[n + 1][m + 1];
		for (int i = 0; i < n; i++){
			a[i]=in.nextInt();
		}
		for (int i = 0; i <m; i++){
			b[i]=in.nextInt();
		}	
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++) {
				if (a[i-1] == b[j-1]) {
					c[i][j] = c[i-1][j-1]+1;
				}else c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
			}
		int l = c[n][m];
		int index=l-1;
		int []temp = new int[l];
		while(index>=0){
		    if(a[n-1]==b[m-1]){
		        temp[index]=a[n-1];
		        n--;
		        m--;
		        index--; 
		    }
		    else if(c[n-1][m]>c[n][m-1]){
		        n--;
		    }
		    else{
		        m--;
		    }
		}
		for(int k=0;k<l;k++) System.out.print(temp[k]+" ");
		in.close();
	}
}

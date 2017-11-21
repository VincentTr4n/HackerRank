package Dynamic_Programming;

import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t0 = 0; t0 < T; t0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int []a = new int[n];
			int []c = new int[k+1];
			for(int i=0;i<n;i++) a[i] = in.nextInt();
			for(int i=0;i<=k;i++) c[i] = k+1;
			c[0] = 0;
			for(int i=0;i<n;i++)
				for(int j=0;j<=k;j++){
					if(j>=a[i] && a[i]+c[j-a[i]] <c[j]) c[j] = a[i]+c[j-a[i]]; 
				}
			int res = 0;
			for(int i=0;i<=k;i++) if(c[i]!=k+1) res = c[i];
			System.out.println(res);
		}

		in.close();
	}

}

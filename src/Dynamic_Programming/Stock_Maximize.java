package Dynamic_Programming;

import java.util.*;

public class Stock_Maximize {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			int n = in.nextInt();
			int[]a = new int[n];
			for(int i=0;i<n;i++) a[i] = in.nextInt();
			long ans = 0;
			int max = 0;
			for(int i=n-1;i>=0;i--){
				max = a[i]>=max?a[i]:max;
				ans+=max-a[i];
			}
			System.out.println(ans);
		}

		in.close();
	}
}

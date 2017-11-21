package Implementation_Challenges;

import java.util.*;

public class Absolute_Permutation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int test = 0; test < T; test++) {
			int n = in.nextInt();
			int k = in.nextInt();
			if (k == 0) {
				for (int i = 1; i <= n; i++)
					System.out.print(i + " ");
				System.out.println();
			} else {
				if (n / 2 >= k && n % k == 0 && n % 2 == 0) {
					int[] ans = new int[n + 1];
					for (int i = 1; i <= n; i++) { 
						if (((i - 1) / k) % 2 == 0)
							ans[i] = i + k;
						else
							ans[i] = i - k;
					} 
					for(int i=1;i<=n;i++){
						System.out.print(ans[i]+" "); 
					}
					System.out.println();
				} else
					System.out.println(-1);
			}
		}
		in.close();
	}

}

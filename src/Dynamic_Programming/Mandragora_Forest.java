package Dynamic_Programming;

import java.util.*;

public class Mandragora_Forest {

	public static void S_Greedy(int[] a) {
		Arrays.sort(a);
		long sum = 0;
		for (int e : a)
			sum += e;
		long S = 1, P = 0;
		for (int i = 0; i < a.length; i++) {
			S++;
			sum -= a[i];
			P = Math.max(P, sum * S);
		}
		System.out.println(P);
	}

	public static void S_DP(int[] a) {
		int n = a.length;
		Arrays.sort(a);
		int[] c = new int[n + 1];
		c[0] = 0;
		for (int i = 1; i <= n; i++) {
			c[i] = c[i - 1] + a[i - 1];
		}
		for (int i = 1; i <= n; i++) {
			if (i * (c[n] - c[i - 1]) > (i + 1) * (c[n] - c[i])) {
				System.out.println(i * (c[n] - c[i - 1]));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t0 = 0; t0 < T; t0++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			S_DP(a);
		}
		in.close();
	}
}

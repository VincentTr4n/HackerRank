package Search;

import java.util.*;

public class Missing_Numbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		int m = in.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++)
			b[i] = in.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		int[] c = new int[m + 1];
		int[] check = new int[200005];
		for (int i = 0; i < n; i++)
			c[i] = a[i];
		for (int i = 0; i < m; i++) {
			if (c[i] - b[i] != 0) {
				n++;
				if (n <= m) {
					for (int j = n - 1; j >= i + 1; j--) {
						c[j] = c[j - 1];
					}
					c[i] = b[i];
					check[b[i]]++;
					if (check[b[i]] == 1)
						System.out.print(b[i] + " ");
				} else
					break;
			}
			// for(int t:a) System.out.print(t+" ");
			// System.out.println();
		}
		in.close();
	}
}

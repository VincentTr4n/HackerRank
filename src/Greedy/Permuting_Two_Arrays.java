package Greedy;

import java.util.*;

public class Permuting_Two_Arrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for (int tc0 = 0; tc0 < tc; tc0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = in.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			boolean ok = false;
			for (int i = 0; i < n; i++) {
				if (a[i] + b[n - i - 1] >= k) {
					ok = true;				
				}
				else {ok = false; break;}
			}
			if(ok) System.out.println("YES");
			else System.out.println("NO");

			in.close();
		}
	}
}
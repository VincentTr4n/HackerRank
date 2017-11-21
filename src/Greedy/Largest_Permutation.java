package Greedy;

import java.util.*;

public class Largest_Permutation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		int[] id = new int[100006];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			id[a[i]] = i;
		}
		for (int i = 0; i < n; i++) {
			if (k > 0) {
				if (a[i] != n - i) {
					a[id[n-i]] = a[i];
					id[a[i]] = id[n-i];
					a[i] = n-i;
					id[n-i] = i;
					k--;
				}

			} else break;
		}
		for(int t : a) System.out.print(t+" ");
		in.close();
	}

}

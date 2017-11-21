package Dynamic_Programming;

import java.util.Scanner;

public class TEST {
	public static int findutil(int a[], int n, int min) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			int temp = a[i] - min;

			count += temp / 5;
			count += temp % 5 / 2;
			count += temp % 5 % 2;
		}
		return count;
	}

	public static int find(int a[], int n, int min) {
		int res = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++)
			res = Math.min(res, findutil(a, n, min - i));

		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int a[] = new int[n];
			int min = Integer.MAX_VALUE;

			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
				if(a[i]<min) min = a[i];
				
			}
			//System.out.println(min);
			System.out.println(find(a, n, min));
			in.close();
		}
	}
}

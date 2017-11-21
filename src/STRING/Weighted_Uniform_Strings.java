package STRING;

import java.util.Scanner;

public class Weighted_Uniform_Strings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = in.nextInt();
		int[] x = new int[n];
		int[] c = new int[27];
		for (int i = 0; i < n; i++)
			x[i] = in.nextInt();
		for (char t : s.toCharArray())
			c[t - 'a' + 1]++;
		for (int i = 0; i < n; i++) {
			boolean ok = false;
			for (int j = 1; j <= 26; j++) {
				if (c[j] > 0) {
					if (x[i] % j == 0) {
						if (x[i] / j <= c[j]) {
							ok = true;
							break;
						}
					}
				}
			}
			if (ok)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		in.close();
	}
}

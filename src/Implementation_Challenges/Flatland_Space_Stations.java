package Implementation_Challenges;

import java.util.*;

public class Flatland_Space_Stations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++)
			a[i] = in.nextInt();
		Arrays.sort(a);

		int max = -1;
		for (int i = 0; i < m - 1; i++){
			max = (a[i + 1] - a[i]) / 2 > max ? (a[i + 1] - a[i]) / 2 : max;
			///System.out.println(max);
		}
		max = max > (n - a[m - 1] - 1) ? max : (n - a[m - 1] - 1);
		max = max > (a[0])?max:a[0];
		System.out.println(max);
		in.close();
	}

}

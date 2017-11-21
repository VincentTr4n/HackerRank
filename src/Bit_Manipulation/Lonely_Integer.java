package Bit_Manipulation;

import java.util.*;

public class Lonely_Integer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int[] a = new int[n];
		// int[] temp = new int[100];
		// for (int i = 0; i < n; i++) {
		// a[i] = in.nextInt();
		// temp[a[i]]++;
		// }
		// for (int i = 0; i < 100; i++)
		// {
		// if(temp[i]==1) System.out.println(i);
		// }
		int n = in.nextInt();
		int[] a = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			ans^=a[i];
		}
		System.out.println(ans);
		in.close();
	}
}

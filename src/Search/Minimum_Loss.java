package Search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class H {
	public int year;
	public long price;

	public H(int y, long p) {
		year = y;
		price = p;
	}
};

class Checker implements Comparator<H> {

	@Override
	public int compare(H a, H b) {
		if (a.price > b.price)
			return 1;
		else if (a.price < b.price)
			return -1;
		else
			return 0;
	}

};

public class Minimum_Loss {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		H[] a = new H[n];
		for (int i = 0; i < n; i++) {
			a[i] = new H(i, in.nextLong());
		}
		long min = Long.MAX_VALUE;
		Arrays.sort(a, new Checker());
		for (int i = 0; i < n - 1; i++) {
			if(a[i+1].price-a[i].price < min && a[i].year > a[i+1].year) min = a[i+1].price-a[i].price;
		}
		System.out.println(min);
		in.close();
	}

}

package STRING;

import java.util.Scanner;

public class Separate_the_Numbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			boolean ok = false;
			long ans = -1;
			for (int i = 1; i <= s.length() / 2; i++) {
				long t = Long.parseLong(s.substring(0, i));
				ans = t;
				String d = "";
				while (d.length() < s.length()) {
					d += Long.toString(t++);
				}
				if (d.equals(s)) {
					ok = true;
					break;
				}
			}
			System.out.println(ok?("Yes "+ans):"No");
		}

		in.close();
	}
}

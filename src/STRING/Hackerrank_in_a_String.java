package STRING;

import java.util.Scanner;

public class Hackerrank_in_a_String {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		String c = "hackerrank";
		for(int q = 0; q < Q; q++){
			String s = in.next();
			int i = 0;
			for(char t : s.toCharArray())
				if(i<c.length() && t==c.charAt(i)) i++;
			if(i==10) System.out.println("YES");
			else System.out.println("NO");
		}
		in.close();
	}

}

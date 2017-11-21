package Implementation_Challenges;

import java.util.Scanner;

public class Designer_PDF_Viewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]c = new int[26];
		for(int i=0;i<26;i++){
			int h = in.nextInt();
			c[i] = h;
		}
		int max = -1;
		String s = in.next();
		for(char t : s.toCharArray()) max = Math.max(c[t-'a'], max);
		System.out.println(max*s.length());
		in.close();
	}

}

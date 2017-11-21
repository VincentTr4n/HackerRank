package STRING;

import java.util.Scanner;

public class Alternating_Characters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t0 = 0;t0<T;t0++){
			String s = in.next();
			int count = 0;
			for(int i = 0;i<s.length()-1;i++){
				if(s.charAt(i)==s.charAt(i+1)) count++;
			}
			System.out.println(count);
		}
		in.close();
	}

}

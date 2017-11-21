package Recursion;

import java.util.Scanner;

public class A_Chessboard_Game {
	public static boolean solution(int x, int y, int p) {
		if (x < 1 || y > 15)
			return p == 1 ? true : false;
		int temp = p == 1 ? 2 : 1;
		return solution(x - 2, y + 1, temp) || solution(x - 2, y - 1, temp) || solution(x + 1, y - 2, temp)
				|| solution(x - 1, y - 2, temp);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t0 = 0; t0 < T; t0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			if(solution(x, y, 1)) System.out.println("First");
			else System.out.println("Second");
		}

		in.close();
	}

}

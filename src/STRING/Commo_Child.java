package STRING;

import java.util.Scanner;

public class Commo_Child {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		int N = a.length();
		int[][] db = new int[N+1][N+1];
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				if(a.charAt(i-1)==b.charAt(j-1)) db[i][j] = db[i-1][j-1] + 1;
				else db[i][j] = Math.max(db[i][j-1], db[i-1][j]);
			}
		}
		System.out.println(db[N][N]);
		
		in.close();
	}

}

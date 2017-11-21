package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Grid_Challenge {
	public static boolean check(char[][]c,int n){
		boolean ok = true;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++){
				if(c[j][i]>c[j+1][i]){ok = false;break;}
			}
		return ok;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][]c = new char[n][n];
		for(int i=0;i<n;i++){
			String s = in.next();
			char[]temp = s.toCharArray();
			Arrays.sort(temp);
			for(int j=0;j<n;j++){
				c[i][j] = temp[j];
			}
			
		}
		if(check(c, n)) System.out.println("YES");
		else System.out.println("NO");
		in.close();
	}
}

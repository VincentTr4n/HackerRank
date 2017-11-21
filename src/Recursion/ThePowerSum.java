package Recursion;

import java.util.Scanner;

public class ThePowerSum {
	public static int Sum(int n,int m,int x)
	{
		if(n==0) return 1;
		if(n<0 || n>0 && m==0) return 0;
		int t = 0;
		for(int i = m;i>=0;i--)
		{
			t+=Sum(n-(int)Math.pow(i, x), i - 1, x);
		}
		return t;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int m = (int)Math.pow(n, (double)1/x);
		System.out.println(Sum(n, m, x));
		in.close();
	}

}

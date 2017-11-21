package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Perimeter_Triangle {

	private static Scanner in;
	public static boolean checkTriangle(int a,int b,int c){
		if (a + b > c && b + c > a && c + a > b) return true;
		return false;
	}
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int [n];
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		Arrays.sort(a);
		//int ok = 1;
//		for(int i = n-1;i>=2;i--)
//			if(checkTriangle(a[i], a[i-1], a[i-2])){
//				System.out.println(a[i-2]+" "+a[i-1]+" "+a[i]);
//				ok = 0;
//				break;//
//			}
//		if(ok==1) System.out.println(-1);
		for(int i = n-3;i >= 0;i--){
			if(a[i]+a[i+1] > a[i+2]){
				System.out.println(a[i] + " " + a[i+1] + " " + a[i+2]);
				return;
			}
		}
		System.out.println(-1);
		in.close();
	}

}

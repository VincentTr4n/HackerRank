package Sorting;

import java.util.Scanner;

public class Count_Sort3 {
	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int n = in.nextInt();
		int []a = new int[n];
		int []cs = new int[100];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
			String s = in.nextLine();
			cs[a[i]]++;
		}
		int s=0;
		for(int i=0;i<100;i++){
			s+=cs[i];
			System.out.print(s+" ");
		}
		in.close();
	}
}
package Greedy;

import java.util.Scanner;

public class Beautiful_Pairs {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int [1009];
		int count = 0;
		for(int i=0;i<n;i++) a[in.nextInt()]++;
		for(int i=0;i<n;i++){
			int temp = in.nextInt();
			if(a[temp]>0){
				count++;
				a[temp]--;
			}
		}
		int check = count==n?count-1:count+1;
		System.out.println(check);
		
		in.close();
	}

}

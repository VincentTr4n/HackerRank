package Constructive_Algorithms;

import java.util.Scanner;

public class New_Year_of_Chaos {

	public static void solution(int[]a){
		int count = 0;
		for(int i=a.length-1;i>=0;i--){
			if(a[i]-(i+1)>2){
				System.out.println("Too chaotic");
				return;
			}
		}
		for(int i=0;i<a.length;i++)
			for(int j = a[i]-2>0?a[i]-2:0;j<i;j++){
				if(a[j]>a[i]) count++;
			}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t0=0;t0<T;t0++){
			int n = in.nextInt();
			int[]a = new int[n];
			for(int i=0;i<n;i++) a[i] = in.nextInt();
			solution(a);
		}
		in.close();
	}
}

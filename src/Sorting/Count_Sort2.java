package Sorting;

import java.util.Scanner;

public class Count_Sort2 {
	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int n = in.nextInt();
		int []a = new int[n];
		int []cs = new int[100];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
			cs[a[i]]++;
		}
		for(int i=0;i<100;i++){
			int j=1;
			while(j<cs[i]){
				System.out.print(i+"");
				j++;
			}
		}
		in.close();
	}
}

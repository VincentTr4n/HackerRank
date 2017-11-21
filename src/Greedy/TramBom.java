package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class TramBom {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[]index = new int[100006];
		int[]a = new int[n];
		int[]b = new int[m];
		for(int i=0;i<n;i++) a[i] = in.nextInt();		
		for(int i=0;i<m;i++){
			b[i] = in.nextInt(); index[b[i]] = i;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		//for(int t : b) System.out.println(t+"---"+index[t]);
		int[]ans = new int[m];
		int i = 0,j = 0;
		while(b[j]<a[i]){
			 ans[index[b[j]]] = -1;
			 j++;
		}
		System.out.println(b[j]);
		while(j<m){
			while( i<n && b[j]>=a[i]){
				System.out.println(b[j]+">="+a[i]);
				i++;
			}
			ans[index[b[j]]] = a[i-1];
			j++;
		}
		for(int t : ans) System.out.println(t);
		in.close();
	}
}

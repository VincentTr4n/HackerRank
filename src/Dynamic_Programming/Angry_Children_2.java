package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Angry_Children_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++) a[i] = in.nextInt();
		Arrays.sort(a);
		int S = 0;
		int[]d = new int[n+1];
		for(int i=0;i<n-1;i++){
			d[i+1]=d[i]+a[i+1]-a[i];
		}
		for(int i=1;i<k;i++){
			
		}
		in.close();
	}

}

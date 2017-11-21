package Search;

import java.util.Arrays;
import java.util.Scanner;

public class Radio_Transmitters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[]a = new int[n];
		int k = in.nextInt();
		for(int i=0;i<n;i++) a[i] = in.nextInt();
		Arrays.sort(a);
		int count = 0,i=0;
		while(i<n){
			int t = a[i]+k;
			while(i<n && a[i]<=t) i++;
			t = a[i-1] + k;
			while(i<n && a[i]<=t) i++;
			count++;
		}
		System.out.println(count);
		in.close();
	}

}

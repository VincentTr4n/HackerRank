package Implementation_Challenges;

import java.util.*;

public class Beautiful_Triplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		int[] c = new int[20050];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			c[a[i]]++;
		}
		int count = 0;
		for (int i = 0; i < n; i++){
			if(c[a[i]+d]>0 && c[a[i]+2*d]>0){
				System.out.println(a[i]+","+(a[i]+d)+","+(a[i]+2*d));
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}

}

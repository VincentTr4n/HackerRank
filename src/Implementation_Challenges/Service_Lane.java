package Implementation_Challenges;

import java.util.*;

public class Service_Lane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int T = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		for (int t0 = 0; t0 < T; t0++) {
			int i = in.nextInt();
			int j = in.nextInt();
			int m1 = Integer.MAX_VALUE;
			int m2 = m1;
			while(i<=j){
//				if(a[i]<=m1){
//					m1 = a[i]; i++;
//				}else i++;
//				if(a[j]<=m2){
//					m2 = a[j];
//					j--;
//				}else j--;
				m1 = a[i]<=m1?a[i]:m1;
                m2 = a[j]<=m2?a[j]:m2;
                i++; j--;
			}
			m1 = m1<m2?m1:m2;
			System.out.println(m1);
		}

		in.close();
	}

}

package Search;

import java.util.Arrays;
import java.util.Scanner;

class A{
	public long v;
	public int index;
	public A(long _v,int i){v=_v;index=i;}
}

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t0 = 0; t0 < T; t0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			A[] a = new A[n];
			for (int i = 0; i < n; i++){
				a[i] = new A(in.nextLong(),i+1);
			}
			a[0].v = a[0].v%m;
			long max = -1;
			for (int i = 0; i < n; i++){
				a[i].v = (a[i].v%m + a[i-1].v%m)%m;
				max = Math.max(a[i].v, max);
			}
			Arrays.sort(a,(x,y)->{
				if(x.v>y.v) return 1;
				else if(x.v<y.v) return -1;
				return 0;
			});
			long min = Long.MAX_VALUE;
			for (int i = 1; i < n-1; i++){
				if(a[i].index>a[i+1].index) min = (a[i+1].v-a[i].v)<min?(a[i+1].v-a[i].v):min;
			}
			System.out.println(Math.max(max, m - min));
			in.close();
		}
	}
}

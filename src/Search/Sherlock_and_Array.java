package Search;

import java.util.*;

public class Sherlock_and_Array {

	static String solve(int[] a) {
		if(a.length==1) return "YES";
		else{
			int sum = 0;
			for(int i : a)
				sum+=i;
			int s=0;
			for(int i=1;i<=a.length-1;i++){
				s+=a[i];
				if(s==sum-a[i+1]-s){
					return "YES";
				}
			}
			return "NO";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			int []sum = new int[20005];
			int[] a = new int[n+1];
			for (int a_i = 1; a_i <=n; a_i++) {
				a[a_i] = in.nextInt();
				sum[a_i] = sum[a_i-1]+a[a_i];
			}
			boolean ok = false;
			for(int i=1;i<=n;i++)
			{
				if(sum[i] == sum[n] - sum[i - 1]) ok = true;
			}
			if(ok) System.out.println("YES");
			else System.out.println("NO");
		}
		in.close();
	}

}

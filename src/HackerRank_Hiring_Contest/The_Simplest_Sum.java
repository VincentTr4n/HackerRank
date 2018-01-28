package HackerRank_Hiring_Contest;

import java.util.Scanner;

public class The_Simplest_Sum {

	public static long MOD = 1000000007;
	public static int d = 0;
	public static long SUM(int k, long a,long b) {
		long sum = 0,pre = 0;
		int pow = 1;
		long index = 1;
		for (index = 1; index < a; index = index * k + 1)
		{
			pre += index;
			pow *= k;
			sum += pre * pow;
		}
		if (index == a) pre += index;
		sum = pre * (index - a);
		if (sum == 0) pre -= index;
		for (; index < b; index = index * k + 1)
		{
			pre += index;
			pow *= k;
			sum += pre * pow;
		}
		if (index == b) pre += index;
		sum = sum - pre * (index - 1 - b);
		return sum;
	}
	
	public static long simplestSum(int k, long a, long b) {
	    long sum = 0,res = 0, i;
	    for (i = 1; i <= b ; i++) {
	        sum += i;
	        long t = i*k;
	        long p = Math.min(b,t);
	        if(d == 0 && t >= a) {
	            d++;
	            res = res  + ((sum % MOD) * (p - a + 1) % MOD) % MOD;
	            if(p == b) return res;
	        }
	        if(i > a) {
	            d++;
	            res = (res%MOD + ((sum % MOD) * (p - i + 1) % MOD)%MOD)%MOD;
	            if(p == b) return res;
	        }
	        i*=k;
	    }
	 
	    return res;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int k = in.nextInt();
			long a = in.nextLong();
			long b = in.nextLong();
			long res = simplestSum(k, a, b);
			if(res < 0) res += MOD;
			System.out.println(res);
	        d = 0;
		}
		in.close();
		
	}

}

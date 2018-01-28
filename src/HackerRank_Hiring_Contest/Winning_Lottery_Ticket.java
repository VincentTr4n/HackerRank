package HackerRank_Hiring_Contest;

import java.util.Scanner;

public class Winning_Lottery_Ticket {
	
	static void solve(int lo, int hi, long []dp)
	{
		if(lo == hi)
		return;
		
		int mid = lo + (hi - lo)/2;
		
		solve(lo, mid, dp);
		solve(mid + 1, hi, dp);
		
		for(int i = lo ; i <= mid ; i++)
		{
			dp[i] += dp[i + (hi - lo + 1)/2];
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = 1 << 10;
		long count = 0;
		int []ar = new int [200000];
		long []dp = new long [200000];
		
		long ans = 0;
		for (int tickets_i = 0; tickets_i < n; tickets_i++) {
			String ticket = in.next();
			int bits = 0;
			int []num = new int[10];
			for(int i = 0 ; i < ticket.length() ; i++)
			{
				int c = ticket.charAt(i) - '0';
		    	bits |= (1 << (c));
		    	num[c]++;
		    }
		    boolean ok = true;
		    for(int i=0;i<10;i++) if(num[i]==0) ok = false;
		    if(ok) count++;
		    
		    ar[tickets_i] = bits;
		    if(ar[tickets_i] == max - 1)
			{
				ans++;
			}
			
			dp[ar[tickets_i]]++;
		}
		
		solve(0,max - 1, dp);
		
		long res = 0;
		
		for(int i = 0 ; i < n ; i++)
		{
			res += dp[max - 1 - ar[i]];
		}
		
		res -= ans;
		res /= 2;
		res += ans;
		res -= count;
		
		System.out.println(res);
		in.close();
	}

}

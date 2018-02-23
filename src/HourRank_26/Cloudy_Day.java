package HourRank_26;

import java.util.Scanner;

public class Cloudy_Day {
	public class Town{
		public long p;
		public long local;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        Town[] local = new Town[n];
        for(int i = 0; i < n; i++){
        	long temp = in.nextLong();
        	sum+=temp;
        }
      
        
        in.close();
	}

}

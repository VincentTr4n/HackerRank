package Greedy;

import java.util.*;

public class Sherlock_and_The_Beast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int [n];
		for(int i=0;i<n;i++)
		{
		 	a[i] = in.nextInt();
		}
		for(int t : a)
		{
			int ok = 1;
			for(int i=t/3;i>=0;i--){			
				if((t-i*3)%5==0){
					ok = 0;
					StringBuilder s=new StringBuilder();
					for(int j=0;j<i*3;j++)
						s.append("5");
					for(int j=0;j<(t-i*3);j++)
						s.append("3");
					System.out.println(s);
					break;
				}
			}
			if(ok==1)  System.out.println(-1);
		}
		in.close();
	}
}

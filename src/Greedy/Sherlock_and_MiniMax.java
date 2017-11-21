package Greedy;

import java.util.*;


import ReadIput.ReadInfor;

public class Sherlock_and_MiniMax {
	public static int max(int[]a){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
			if(a[i]>=max) max = a[i];
		return max;
	}
	public static int min(int[]a,int temp){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int t = Math.abs(a[i]-temp);
			if(t<=min) min =t;
		}	
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ReadInfor r = new ReadInfor();
		ArrayList<String> list = r.readf("temp1.txt");
		int n = Integer.parseInt(list.get(0));
		int [] a = new int [n];
		String temp[] = list.get(1).split(" ");	
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(temp[i]);
		}
		String temp2[] = list.get(2).split(" ");
		int P = Integer.parseInt(temp2[0]); int Q = Integer.parseInt(temp2[1]);
		//int[] id = new int [Q+3];
		int result = 0;
		int max = Integer.MIN_VALUE;
		//int [] b = new int[Q-P+9];
		for(int i=Q;i>=P;i--){
			int t = min(a, i);
			if(t>=max){
				max=t;
				result=i;
			}
		}
		System.out.println(result);
		in.close();
	}

}

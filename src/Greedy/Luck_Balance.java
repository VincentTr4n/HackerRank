package Greedy;

import java.util.*;

public class Luck_Balance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int s = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++)
		{
			int l = in.nextInt();
			int t = in.nextInt();
			s += l;
			if(t == 1) list.add(l);
		}
		Collections.sort(list);
		int s1 = 0;
		int d = list.size() - k;
		for(int i=0; i< d; i++)
			s1 += list.get(i);
		System.out.println(s-2*s1);
		in.close();
	}
}

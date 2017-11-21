package Greedy;

import java.util.*;

public class Priyanka_and_Toys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		Arrays.sort(a);
		int count = 1;
		int pre = a[0];
		for(int i=1;i<n;i++)
			if(a[i] - pre >4) {count++;pre = a[i];};
//		Stack<Integer> s = new Stack<>();
//		s.push(-1);
//		for (int i = n - 1; i >= 0; i--)
//			s.push(a[i]);
//		int count = 1;
//		int temp1 = s.pop(), temp2 = s.pop();
//		while (!s.isEmpty()) {
//			if (temp2 <= temp1 + 4 && temp2 >= temp1)
//			{			
//				temp2 = s.pop();
//			}
//			else {
//				temp1 = temp2;
//				temp2 = s.pop();
//				count++;
//			}
//			
//		}
		System.out.println(count);
		in.close();
	}

}

package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Equal {

	public static int getNumbers(int num) {
		return num/5+num%5/2+num%5%2;
	}

	public static int solution(int[]a,int min){
		int count = 0;
		for(int i=0;i<a.length;i++){
			count+=getNumbers(a[i]-min);
		}
		return count;
	}
	
	public static int Result(int[]a,int min){
		int temp = 0;
		int res = Integer.MAX_VALUE;
		for(int i=0;i<=3;i++){
			temp = solution(a, min-i);
			res = temp<res?temp:res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			int a[] = new int[n];
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if (a[i] < min)
					min = a[i];

			}
			Arrays.sort(a);
			// System.out.println(min);
			System.out.println(Result(a, min));
			
		}
		in.close();
	}
}
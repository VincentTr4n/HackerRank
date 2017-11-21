package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Marc_s_Cakewalk {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] calories = new int[n];
		for (int calories_i = 0; calories_i < n; calories_i++) {
			calories[calories_i] = in.nextInt();
		}
		Arrays.sort(calories);
		long result = 0;
		for(int i = n-1,j=0;i>=0;i--,j++){
			result += Math.pow(2, j) * calories[i];
		}
		System.out.println(result);
		in.close();
	}

}

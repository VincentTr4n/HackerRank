package Implementation_Challenges;

import java.util.Scanner;

public class Beautiful_Days {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for(;i<=j;i++){
			int temp = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
			System.out.println(i+"----"+temp);
			if(Math.abs(i-temp)%k==0) count++;
		}
		System.out.println(count);
		in.close();
	}

}

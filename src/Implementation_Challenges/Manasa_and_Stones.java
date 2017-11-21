package Implementation_Challenges;

import java.util.*;

public class Manasa_and_Stones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int index = 0; index < T; index++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			if(a>=b){
				int t = a; a=b; b=t;
			}
			int max = -1;
			for(int i=n-1;i>=0;i--)
			{
				int temp = i*a+((n-1)-i)*b;
				if(temp>max) {System.out.print(temp+" "); max = temp;}
			}
			System.out.println();
		}

		in.close();
	}
}

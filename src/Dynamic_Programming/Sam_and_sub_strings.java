package Dynamic_Programming;

import java.util.Scanner;

public class Sam_and_sub_strings {
	static int c_i(char c){
		return c-'0';
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long M  = 1000000007;
		String n = in.next();
		long ans = c_i(n.charAt(0));
		long sum = ans;
		for(int i=1;i<n.length();i++){
			sum = (sum*10 + c_i(n.charAt(i))*(i+1))%M;
			ans = (sum+ans)%M;
		}
		System.out.println(ans);
		in.close();
	}
}

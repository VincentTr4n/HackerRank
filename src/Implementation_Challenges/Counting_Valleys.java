package Implementation_Challenges;

import java.util.Scanner;

public class Counting_Valleys {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int count = 0;
		boolean ok = true;
		int d = 0;
		for(char c : s.toCharArray()){
			if(c=='U') {d--; ok=true;}
			if(c=='D') {d++; ok=false;}
			if(ok==true && d==0) count++;
		}
		System.out.println(count);
		in.close();
	}
}

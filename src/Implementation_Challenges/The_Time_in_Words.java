package Implementation_Challenges;

import java.util.Scanner;

public class The_Time_in_Words {
	static String[] num = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen",
			"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
			"twenty seven", "twenty eight", "twenty nine","half" };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		if(m==0) System.out.print(num[h]+" o' clock");
		else{
			if(m<=30){
				if(m==15) System.out.print(num[m]+" past "+num[h]);
				else if(m==30) System.out.print(num[m]+" past "+num[h]);
				else if(m==1) System.out.print(num[m]+" minute past "+num[h]);
				else System.out.print(num[m]+" minutes past "+num[h]);
			}
			else{
				int m1 = 60-m;
				h = h==12?0:h;
				if(m1==15) System.out.print(num[m1]+" to "+num[h+1]);
				else System.out.print(num[m1]+" minutes to "+num[h+1]);
			}
		}
		in.close();
	}
}

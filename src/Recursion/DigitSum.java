package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class DigitSum {
	
//Recursion-----------------------------
	public static int Result(String s)
	{
		int ans = 0;
		for(char c : s.toCharArray()) {
			ans+=c-'0';
			//System.out.print((c-'0'+"+"));
		}
		if(String.valueOf(ans).length()==1) return ans;
		else return Result(String.valueOf(ans));
		
	}
	
//	Orther solution
	public static int sum(String s){
		int res = 0;
		for(char c : s.toCharArray()){
			res+=c-'0';
			if(res>9) res = res%10+1;
		} 
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		int d = sum(String.valueOf(n));
		int r = Result(String.valueOf(n));
		System.out.println(d);
		System.out.println(r);
		in.close();
	}
//	String a = in.nextLine();
//	String []s = a.split(" ");
//	String n = s[0];
//	int k = Integer.parseInt(s[1]);
//	int d = Result(n);
//	System.out.println(Result(String.valueOf(d*k)));
//	for(int i=0;i<1;i++){
//		ans+=d;
//		if(ans>9) ans = ans%10+1;
//	}
}

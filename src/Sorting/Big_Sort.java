package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		if(a.length()!=b.length()) return a.length()-b.length();
		else{
			for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return a.charAt(i)-b.charAt(i);
		}
		return 0;
	}

}
public class Big_Sort {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		String[]a = new String[n];
//		for(int i=0;i<n;i++) a[i] = in.next();
//		Arrays.sort(a,new Checker());
//		for(String s : a) System.out.print(s+" ");
//		in.close();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] s = new String[n];
		for(int i = 0;i < n;i++) s[i] = in.next();
		Arrays.sort(s, (x,y) -> {
			if(x.length() != y.length())return x.length() - y.length();
			return x.compareTo(y);
		});
		for(String a : s) System.out.println(a);
		in.close();
	}
}

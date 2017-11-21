package STRING;

import java.util.Scanner;

public class Bear_and_Steady_Gene {
	public static int index(char temp){
		if(temp=='A') return 0;
		else if(temp=='C') return 1;
		else if(temp=='G') return 2;
		else return 3;
	}
	public static boolean check(int[]a,int n){
		int l = n/4;
		if(a[0]<=l && a[1]<=l && a[2]<=l && a[3]<=l) return true;
		return false;
	}
	public static void solution(String s,int n){
		int[]a = new int[4];
		char[]c = s.toCharArray();
		for(char t : c) a[index(t)]++;
		if(check(a, n)){ System.out.println(0); return;}
		int i = 0, j = 0;
		int min=Integer.MAX_VALUE;
		while(i<n && j<n){
			if(!check(a, n)){
				a[index(c[j++])]--;
			}else{
				min = Math.min(min, j-i);
				a[index(c[i++])]++;
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		solution(s, n);
		in.close();
	}
}

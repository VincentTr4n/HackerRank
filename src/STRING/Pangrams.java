package STRING;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.toLowerCase().trim().replaceAll("\\s+","");
		int[]a = new int[26];
		for(char c : s.toCharArray()) a[c-'a']++;
		boolean ok = true;
		for(int i=0;i<26;i++) if(a[i]==0) ok = false;
		if(ok) System.out.println("pangram");
		else System.out.println("not pangram");
		in.close();
		//System.out.println((new Scanner(System.in)).nextLine().toLowerCase().chars().boxed().collect(Collectors.toSet()).size() == 27 ? "pangram" : "not pangram");
	}

}

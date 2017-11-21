package STRING;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

	public static Set<Character> convertToSet(String s) {
		Set<Character> set = new HashSet<Character>(26);
		for (char c : s.toCharArray())
			set.add(Character.valueOf(c));
		return set;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Character> set = convertToSet(in.next());
		for (int i = 1; i < n; i++) {
			Set<Character> temp = convertToSet(in.next());
			System.out.println(temp.toString());
			set.retainAll(temp);
			System.out.println(set.toString());
		}
		System.out.println(set.size());
		in.close();
	}

}

package STRING;

import java.util.HashSet;
import java.util.Scanner;

public class Two_Characters {

	static int alternating(String s, char a, char b) {
	    int count = 0;
	    boolean check = false;
	    for (char c : s.toCharArray()) {
	        if (c == a) {
	            if (check) return 0;
	            count++;
	            check = true;
	        }
	        if (c == b) {
	            if (!check && count>0) return 0;
	            count++;
	            check = false;
	        }
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int res = 0;
			HashSet<Character> set = new HashSet<>();
			for(char c : s.toCharArray()) set.add(c);
			for(char c1 : set)
				for(char c2 : set){
					if(c1!=c2){
					int count = alternating(s, c1, c2);
					res = count>res?count:res;
					}
				}
		System.out.println(res);
		in.close();
	}
}

package Implementation_Challenges;

import java.util.*;

public class Append_and_Delete {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		int i = 0;
		int n = t.length() < s.length() ? t.length() : s.length();
		for (; i < n; i++) {
			if (s.charAt(i) != t.charAt(i))
				break;
		}
		if((s.length()+t.length()-2*i)>k){
            System.out.println("No");
        }

        else if((s.length()+t.length()-2*i)%2==k%2){
            System.out.println("Yes");
        }

        else if((s.length()+t.length()-k)<0){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }
		in.close();
	}
}

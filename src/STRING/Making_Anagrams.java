package STRING;
import java.util.*;

public class Making_Anagrams {
	
	static int makingAnagrams(String s1, String s2){
		int ans = 0;
		int []c = new int[26];
		for(char c1 : s1.toCharArray()) c[c1-'a']++;
		for(char c1 : s2.toCharArray()) c[c1-'a']--;
		for(int i=0;i<26;i++) ans+=Math.abs(c[i]);	
		return ans;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
        in.close();
	}
}

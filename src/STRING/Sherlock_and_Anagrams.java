package STRING;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sherlock_and_Anagrams {
	
	public static boolean anagram(String s1,String s2) {
		int[]a1 = new int[26];
		int[]a2 = new int[26];
		for(char c : s1.toCharArray()) a1[c-'a']++;
		for(char c : s2.toCharArray()) a2[c-'a']++;
		for(int i=0;i<26;i++) if(a1[i]!=a2[i]) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- >0){
			String s = in.next();
			int count =0;
			for(int i=1;i<=s.length();i++){
				List<String> mlist = new ArrayList<>();
				for(int j=0;j<=s.length()-i;j++){
					mlist.add(s.substring(j,j+i));
				}
				for(int k1=0;k1<mlist.size();k1++)
					for(int k2=k1+1;k2<mlist.size();k2++) if(anagram(mlist.get(k1), mlist.get(k2))) count++;
			}
			System.out.println(count);
		}
		in.close();
	}
}

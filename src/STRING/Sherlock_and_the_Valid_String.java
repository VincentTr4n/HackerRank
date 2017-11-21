package STRING;

import java.util.Scanner;

public class Sherlock_and_the_Valid_String {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int[]a = new int[26];
		for(char c : s.toCharArray()) a[c-'a']++;
		int count = 0, min = Integer.MAX_VALUE, max = -1;
		for(int i=0;i<26;i++){
			if(a[i]>0){
				count++;
				min = a[i]<min?a[i]:min;
				max = a[i]>max?a[i]:max;
			}
		}
		int d = 0, c = 0;
		for(int i=0;i<26;i++){
			if(a[i]==min) d++;
			if(a[i]==max) c++;
		}
		if(min==max) System.out.println("YES");
		else{
			if(max-min==1){
				if(count-d==1 || count-c ==1) System.out.println("YES");
				else System.out.println("NO");
			}else{
				if(d==1 && count-d-c==0) System.out.println("YES");
				else System.out.println("NO");
			}
		}
		in.close();
	}
}

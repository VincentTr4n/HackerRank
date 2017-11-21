package Dynamic_Programming;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			int q = in.nextInt();
			for(int q0=0;q0<q;q0++){
				String a = in.next();
				String b = in.next();
				int []au = new int[26];
				int []ar = new int[b.length()];
				String s="";
				int index = 0;
				for(char c : b.toCharArray()) {au[c-'A']++; ar[index++]=c-'A';}
				index=0;
				for(char c : a.toCharArray()){
	                int temp = index;
					if(c>=97){
						if(au[c-'a']>0)
							if(ar[index++]==c-'a') {s+=c;au[c-97]--;}
							else {index = temp;}
					}
					if(c<=90){
						if(au[c-'A']>0 && ar[index++]==c-'A') {s+=c;au[c-65]--;}
						else {index = temp;s+=c;}
					}
				}
				if(s.toUpperCase().equals(b)) System.out.println("YES");
				else System.out.println("NO");
			}
			in.close();	
	}

}

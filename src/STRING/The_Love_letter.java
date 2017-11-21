package STRING;

import java.util.Scanner;

public class The_Love_letter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t0 = 0;t0<T;t0++){
			String s = in.next();
			int i = 0,j = s.length()-1;
			int count = 0;
			while(i<j){
				int d = 0;
				if(s.charAt(i)>s.charAt(j)){
					d = s.charAt(i)-s.charAt(j);
				}else if(s.charAt(i)<s.charAt(j)){
					d = s.charAt(j)-s.charAt(i);
				}
				count+=d;
				i++; j--;
			}
			System.out.println(count);
		}
		in.close();
	}
}

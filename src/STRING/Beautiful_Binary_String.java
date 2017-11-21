package STRING;

import java.util.Scanner;

public class Beautiful_Binary_String {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int count = 0;
		for(int i = 0;i<n-2;i++){
			if(s.substring(i, i+3).equals("010")){
				i+=2; count++;
			}
		}
		System.out.println(count);
		System.out.println((s.length() - s.replaceAll("010","").length())/3);
		in.close();
	}
}

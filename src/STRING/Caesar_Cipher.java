package STRING;

import java.util.Scanner;

public class Caesar_Cipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[]c =  in.next().toCharArray();
		int k = in.nextInt();
		for(int i=0;i<n;i++){
			if(Character.isLetter(c[i])){
				int temp = c[i]<91?65:97;
				System.out.print((char)(temp+(c[i]-temp+k)%26));
			}
			else System.out.print(c[i]);
		}
		in.close();
	}

}

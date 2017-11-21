package STRING;

import java.util.Scanner;

public class Richie_Rich {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		char[]c = in.next().toCharArray();
		int i=n/2 - 1; int j = i+1;
		if (n % 2 != 0)
			j++;
		while (i >= 0 && j <= n - 1) {
			if (c[i] != c[j]) {
				k--;
				if (c[i] > c[j]) c[j] = c[i];
				else c[j] = c[i];
			}
			i--; j++;
		}
		if (k == 0) for (char e : c) System.out.print(e);
		else if(k>0){
			int d = k/2;
			if(k%2!=0) d++;
			for(int t=0;t<d/2;t++){
				c[t] = '9';
			}
			for(char e : c) System.out.print(e);	
		}else System.out.println(-1);
		in.close();
	}
}

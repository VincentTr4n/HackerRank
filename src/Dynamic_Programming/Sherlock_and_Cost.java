package Dynamic_Programming;
import java.util.*;

public class Sherlock_and_Cost {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t = 0;t<T;t++){
			int n = in.nextInt();
			int[]a = new int[n];
			for(int i=0;i<n;i++) a[i] = in.nextInt();
			int l=0,r=0;
			for(int i=0;i<n-1;i++){
				int tl = Math.max(l,r+ a[i]-1);
				int tr = Math.max(r, l+ a[i+1]-1);
				l=tl;  r = tr;
				System.out.println(tl+" "+tr);
			}
			System.out.println(Math.max(l, r));
		}
		
		in.close();
	}
}

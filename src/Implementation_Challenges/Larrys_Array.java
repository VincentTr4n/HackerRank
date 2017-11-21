package Implementation_Challenges;
import java.util.*;

public class Larrys_Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t0=0;t0<T;t0++){
			int n = in.nextInt();
			int[]a = new int[n];
			int d = 0;
			for(int i=0;i<n;i++) a[i] = in.nextInt();
			for(int i=0;i<n-1;i++)
				for(int j=i+1;j<n;j++)
					if(a[i]>a[j]) d++;
			if(d%2==0) System.out.println("YES");
			else System.out.println("NO");
		}
		in.close();
	}
}

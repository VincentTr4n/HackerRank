package Dynamic_Programming;
import java.util.*;

public class The_Maximum_Subarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t0=0;t0<T;t0++){
			int n = in.nextInt();
			int[]a = new int[n];
			for(int i=0;i<n;i++) a[i] = in.nextInt();
			int max1 = a[0];
//			int[]b = new int[n];
//			b[0] =  a[0];
			int temp = a[0];
			for(int i=1;i<n;i++){
				if(temp>0) temp = temp + a[i];
				else temp = a[i];
				max1 = Math.max(max1, temp);
			}
			int max2 = 0;
			for(int i : a) if(i>0) max2+=i;
			max2 = max2==0?max1:max2;
			System.out.println(max1+" "+max2);
		}
		in.close();
	}

}

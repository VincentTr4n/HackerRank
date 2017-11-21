package Greedy;
import java.util.*;

public class TEMP {
	public static int max(int[]a){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
			if(a[i]>=max) max = a[i];
		return max;
	}
	public static int min(int[]a,int temp){
		int [] b = new int[a.length];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			b[i] = Math.abs(a[i]-temp);
			if(b[i]<=min) min = b[i];
		}	
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int [n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		int P = in.nextInt(); int Q = in.nextInt();
		//int[] id = new int [Q+3];
		int [] b = new int[Math.abs(Q-P)+4];
		for(int i=Q,j=0;i>=P;i--){
			b[j] = min(a, i);
			//id[b[j]] = i;
			j++;
		}
		int t = max(b);
		for(int i=P,j=0;i<=Q;i++){
			if(b[j]==t){
				System.out.println(i);
				break;
			}
			j++;
		}
		in.close();
	}
}

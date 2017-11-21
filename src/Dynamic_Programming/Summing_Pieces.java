package Dynamic_Programming;
import java.util.*;

public class Summing_Pieces {

	public static int MAX = 1000000007;
	
	public static int solution(int i,int[]a){
		if(i+1>=a.length) return a[i]%=MAX;
		int sum = 0;
		int temp = 0;
		for(;i<a.length;i++){
			temp+=a[i];
			sum+=(i+1)*temp+(a.length-i-1)*solution(i+1, a);
		}
		return sum%MAX;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++) a[i] = in.nextInt();
//		int sum = 0;
//		for(int e : a) sum+=e;
//		int ans = sum;
//		int temp = 0;
//		for(int i=0;i<n;i++){
//			temp+=a[i];
//			ans+=(i+1)*temp+(n-i-1)*(sum-temp);
//		}
//		ans%=MAX;
		System.out.println(solution(0,a));
		in.close();
	}

}

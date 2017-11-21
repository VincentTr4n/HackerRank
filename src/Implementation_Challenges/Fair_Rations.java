package Implementation_Challenges;
import java.util.*;

public class Fair_Rations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++) a[i] = in.nextInt();
		int count=0;
		for(int i=0;i<n-1;i++){
			if((a[i]%2!=0 && a[i+1]%2==0) || (a[i]%2!=0 && a[i+1]%2!=0)){
				a[i]++; a[i+1]++;
				count+=2;
			}
		}
		if((a[n-2]+a[n-1])%2!=0) System.out.println("NO");
		else System.out.println(count);
		in.close();
	}

}

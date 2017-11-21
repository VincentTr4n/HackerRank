package Implementation_Challenges;
import java.util.*;

public class Chocolate_Feast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int t1=0;t1<t;t1++){
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int d = n/c;
			int ans = n/c;
			while(d>=m){
				d-=m;
				d++;
				ans++;				
			}
			System.out.println(ans);
			
		}
		in.close();
	}

}

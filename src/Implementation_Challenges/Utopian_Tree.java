package Implementation_Challenges;
import java.util.*;

public class Utopian_Tree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t0=0;t0<T;t0++){
			int n = in.nextInt();
			int ans = 1;
			if(n==0) System.out.println(1);
			else{
				for(int i=0;i<n;i++){
					if(i%2==0) ans*=2;
					else ans+=1;
				}
				System.out.println(ans);
			}
		}	
		in.close();
	}
}

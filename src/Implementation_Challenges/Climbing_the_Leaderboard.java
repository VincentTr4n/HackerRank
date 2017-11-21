package Implementation_Challenges;
import java.util.Scanner;
class rank{
	public int s;
	public int r;
	public rank(int _s,int _r){ s=_s; r=_r;}
}

public class Climbing_the_Leaderboard {

	public static int customBS(rank[]lb,int x){
		if(x>lb[0].s) return 1;
		else if(x<lb[lb.length-1].s) return lb[lb.length-1].r+1;
		else {
			int l = 0;
			int r = lb.length-1;
			while(l<r){
				int mid = (l+r)/2;
				if(lb[mid].s<=x) r = mid;
				else l = mid+1;
			}
			if(l==r && lb[l].s<=x) return lb[l].r;
			else return lb[l].r-1;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		rank[]lb = new rank[n];
		for(int i=0;i<n;i++) lb[i] = new rank(in.nextInt(),1);
		for(int i=0;i<n-1;i++){
			if(lb[i].s==lb[i+1].s) lb[i+1].r = lb[i].r;
			else if(lb[i].s>=lb[i+1].s) lb[i+1].r = lb[i].r+1;
		}
		int m = in.nextInt();
		for(int i=0;i<m;i++){
			int temp = in.nextInt();
			System.out.println(customBS(lb, temp));
		}
		
		in.close();
	}

}

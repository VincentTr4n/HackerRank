package Recursion;

import java.util.*;

class G{
	public int element;
	public int index;
	public G(int e,int i){
		element = e; index = i;
	}
}

public class Gaming_Array {

	public static int cusMax(int i,int j,G[]a){
		int max = -1;
		for(;i<j;i++) if(a[i].element>max) max = a[i].element;
		return max;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			//Algorithm O(n)
			int n = in.nextInt();
			int count = 0;
			int max = 0;
			for(int i=0;i<n;i++){
				int a = in.nextInt();
				if(a>max){
					max = a;
					count++;
				}
			}
			if(count%2==0) System.out.println("ANDY");
			else System.out.println("BOB");
			
			
			
//			G[]a = new G[n];
//			for(int i=0;i<n;i++){
//				a[i] = new G(in.nextInt(),i);
//			}
//			int count = 0;
//			int r = n	;
//			while(r>0){
//				int m = cusMax(0, r, a);
//				for(int i=0;i<r;i++)
//					if(a[i].element==m){
//						r = i; break;
//					}
//				count++;
//			}
//			if(count%2==0) System.out.println("ANDY");
//			else System.out.println("BOB");
		}
		in.close();
	}

}

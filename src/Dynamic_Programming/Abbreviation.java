package Dynamic_Programming;
import java.util.*;

public class Abbreviation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int[]T1 = new int[26];
		int[]T2 = new int[26];
        for(int a0 = 0; a0 < q; a0++)
        {
        	String a = in.next();
    		String b = in.next();
    		if(a.length()<b.length()) System.out.println("NO");
    		else{
    			for (int i : a.toCharArray()) if(i<97) T1[i-'A']++;
    			for (int i : b.toCharArray()) if(i<97) T2[i-'A']++;
    			boolean ok = false;
    			for (int i = 0; i < 26; i++) if(T1[i]>T2[i]) {ok = true; break;}
    			if(ok) System.out.println("NO");
    			else{
    				a = a.toUpperCase();
            		int N = a.length();
            		int M = b.length();
            		int[][] db = new int[N+1][M+1];
            		for(int i=1;i<=N;i++){
            			for(int j=1;j<=M;j++){
            				if(a.charAt(i-1)==b.charAt(j-1)) db[i][j] = db[i-1][j-1] + 1;
            				else db[i][j] = Math.max(db[i][j-1], db[i-1][j]);
            			}
            		}
            		if(db[N][M]==M) System.out.println("YES");
            		else System.out.println("NO");
    			}
        		T1 = new int[26];
        		T2 = new int[26];
    		}
        }
		in.close();
	}
}

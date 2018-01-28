package Implementation_Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Organizing_Containers_of_Balls {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            long[]R = new long[n];
            long[]C = new long[n];
            for(int i=0;i<n;i++)
            	for(int j=0;j<n;j++){
            		long temp = in.nextLong();
            		R[i]+=temp;
            		C[j]+=temp;
            	}
            Arrays.sort(R);
            Arrays.sort(C);
            boolean ok = true;
            for (int i = 0; i < n; i++) if(R[i]!=C[i]){ok=false; break;}
            if(ok) System.out.println("Possible");
            else System.out.println("Impossible");
        }
        in.close();
	}

}

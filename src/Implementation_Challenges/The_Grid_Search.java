package Implementation_Challenges;

import java.util.Scanner;

public class The_Grid_Search {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String[] G = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String[] P = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			boolean end = false;
			for(int j=0;j<R-r;j++)
				for(int k=0;k<C;k++)
				{   

				if(G[j].charAt(k)==P[0].charAt(0))
				    {   
				    int flag=1;
				    if(C-k>=c)  
				    for(int pr=0;pr<r;pr++)
				    {
				    if(flag==0)
				    break;  
				    for(int pc=0;pc<c;pc++)
				    {   

				        if(G[j+pr].charAt(k+pc)==P[pr].charAt(pc)){
				            if(pr==r-1&&pc==c-1)
				                end=true;
				            flag=1;
				            }
				        else{   
				        flag=0;
				        break;
				        }
				    }
				}
				}
				}
			if (end)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}

}

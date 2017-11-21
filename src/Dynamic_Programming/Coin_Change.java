package Dynamic_Programming;

import java.util.Scanner;

public class Coin_Change {

	public static int count=0;
	public static long []A;
	public static long []X=new long[300];
	public static int n;
	public static int m;
	
	public static void TRY(int k,long T){
		if(k==n-1){
			if((m-T)%A[n]==0){
				X[n]=(m-T)/A[n];
				count++;
			}
		}else{
			for(int t=0;t<=(m-T)/A[k+1];t++){
				X[k+1]=t;
				TRY(k+1,T+t*A[k+1]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        A=new long[n+1];
        for(int i=1;i<=n;i++) A[i]=in.nextLong();
        TRY(0, 0);
        System.out.println(count);
        in.close();
	}

}

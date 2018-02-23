package Dynamic_Programming;

import java.util.Scanner;

public class Coin_Change {

//	public static int count=0;
//	public static long []A;
//	public static long []X=new long[300];
//	public static int n;
//	public static int m;
//	
//	public static void TRY(int k,long T){
//		if(k==n-1){
//			if((m-T)%A[n]==0){
//				X[n]=(m-T)/A[n];
//				count++;
//			}
//		}else{
//			for(int t=0;t<=(m-T)/A[k+1];t++){
//				X[k+1]=t;
//				TRY(k+1,T+t*A[k+1]);
//			}
//		}
//	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] A=new int[n];
        long[] mem = new long[m+1];
        mem[0] = 1;
        for(int i=0;i<n;i++) A[i]=in.nextInt();
        for(int i=0;i<n;i++)
        	for(int j=A[i];j<=m;j++) mem[j] += mem[j-A[i]];
        System.out.println(mem[m]);
        in.close();
	}

}

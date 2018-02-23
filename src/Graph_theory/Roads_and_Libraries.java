package Graph_theory;

import java.util.ArrayList;
import java.util.Scanner;

public class Roads_and_Libraries {
	public static ArrayList<Integer>[]g;
    public static boolean[]vis;
	public static void dfs(int src){
		vis[src] = true;
		for(int i=0;i<g[src].size();i++) if(!vis[g[src].get(i)]) dfs(g[src].get(i));
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int n = in.nextInt();
	            int m = in.nextInt();
	            g = (ArrayList<Integer>[])new ArrayList[n];
	            for(int i=0;i<n;i++) g[i] = new ArrayList<Integer>();
	            vis = new boolean[n];
	            int c_lib = in.nextInt();
	            int c_road = in.nextInt();
	            for(int i=0;i<m;i++){
	            	int u = in.nextInt();
	            	int v = in.nextInt();
	            	g[u-1].add(v-1);
	            	g[v-1].add(u-1);
	            }
	            if(c_road>c_lib) System.out.println(c_lib*n);
	            else{
	            	int con = 0;
	            	for(int i=0;i<n;i++)
	            		if(!vis[i]){
	            			dfs(i);
	            			con++;
	            		}
	            	long temp1 = (n-con)*c_road;
	            	long temp2 = con*c_lib;
	            	long res = temp1+temp2;
	            	System.out.println(res);
	            }
	        }
	        in.close();
	}

}

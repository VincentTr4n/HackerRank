package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Max_Min {

	 public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      int N = Integer.parseInt(in.readLine());
	      int K = Integer.parseInt(in.readLine());
	      int[] a = new int[N];

	      for(int i = 0; i < N; i ++)
	         a[i] = Integer.parseInt(in.readLine());    
	      int unfairness = Integer.MAX_VALUE;
	      Arrays.sort(a);
	      for(int i = 0; i < N-K+1; i ++)
	      {
	    	  if(a[i+K-1]-a[i] < unfairness) unfairness =  a[i+K-1]-a[i];
	      }      
	      System.out.println(unfairness);
	}

}

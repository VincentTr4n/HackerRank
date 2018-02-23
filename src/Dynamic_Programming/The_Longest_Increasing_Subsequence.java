package Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class The_Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        List<Integer> min = new ArrayList<Integer>();
        for (int i : arr) {
			int l = 0,r = min.size();
			System.out.println(r);
			while(l<r){
				int m = (l+r)/2;
				if(min.get(m)<i) l=m + 1;
				else r=m;
			}
			if(r==min.size()) min.add(i);
			else min.set(r, i);
//			for(int x : min) System.out.print(x+" ");
//			System.out.println();
		}
        System.out.println(min.size());
        in.close();
	}

}

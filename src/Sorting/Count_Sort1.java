package Sorting;
import java.util.*;

public class Count_Sort1 {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int n = in.nextInt();
		int []a = new int[n];
		int []cs = new int[100];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
			cs[a[i]]++;
		}
		for(int i : cs) System.out.print(i+" ");
		in.close();
	}

}

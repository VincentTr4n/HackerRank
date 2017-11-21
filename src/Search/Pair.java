package Search;

import java.util.*;

public class Pair {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		int count = 0;
		Arrays.sort(a);
//		int i=1,j=0;
//		while(i<a.length){
//			int temp = a[i] - a[j];
//			if(temp==k){
//				count++;
//				i++;
//			}else{
//				if(temp>k){
//					j++;
//				}else i++;
//			}
//		}
		int p = 0;
		for(int i = 0;i < n;i++){
			while(p < i && a[i]-a[p] > k)p++;
			if(a[i]-a[p] == k)count++;
		}
		System.out.println(count);
		in.close();
	}

}

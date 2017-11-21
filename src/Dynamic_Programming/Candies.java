package Dynamic_Programming;

import java.util.*;

import ReadIput.ReadInfor;

public class Candies {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ReadInfor r = new ReadInfor();
		ArrayList<String> list = new ArrayList<String>();
		list = r.readf("temp1.txt");
		int n = Integer.parseInt(list.get(0)); //in.nextInt();
		int[]a = new int[n];
		int[]c = new int[n];
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(list.get(i+1)); //in.nextInt();
			c[i] = 1;
		}
		for(int i=0;i<n-1;i++){
			if(a[i]<a[i+1]) c[i+1] = c[i]+1;
		}
		int ans = 0;
		for(int i=n-2;i>=0;i--){
			if(a[i+1]<a[i] && c[i]<c[i+1]+1) c[i] = c[i+1]+1;
		}
		for(int i=0;i<n;i++){
			ans+=c[i];
		}
		System.out.println(ans);
		in.close();
	}

}

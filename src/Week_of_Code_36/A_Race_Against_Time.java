package Week_of_Code_36;

import java.util.Scanner;

public class A_Race_Against_Time {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long h = in.nextLong();
		long[] a = new long[n-1];
		long[] p = new long[n-1];
		for(int i=0;i<n-1;i++) a[i] = in.nextLong();
		for(int i=0;i<n-1;i++) p[i] = in.nextLong();
		
		long sum=0;
		int count=0;
		for(int i=0;i<n-1;i++){
			count++;
			if(a[i]>h){
				sum+=count+Math.abs(a[i]-h)+p[i];
				h=a[i];
				count=0;
			}
			else{
				long temp = Math.abs(a[i]-h)+p[i];
				if(temp < 1){
					sum+=count+temp;
					h=a[i];
					count=0;
				}
			}
		}
		sum+=count+1;
		System.out.println(sum);
		in.close();
	}

}

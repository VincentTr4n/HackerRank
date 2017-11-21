package Greedy;

import java.util.*;

public class Chief_Hopper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int botEnergy = 0;
		for(int i=n-1;i>=0;i--) botEnergy = ((a[i]+botEnergy)+1)/2;
			
		System.out.println(botEnergy);
		in.close();
	}

}

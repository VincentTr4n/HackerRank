package Week_of_Code_36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revised_Russian_Roulette {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> mlist = new ArrayList<>();
		int min = 0,max = 0,temp=0;
		for(int i=0;i<n;i++){
			int a = in.nextInt();
			if(a==1){
				max++;
				temp++;
				if(i==n-1 && temp!=0) mlist.add(temp);
			}else{
			 	if(temp!=0){
			 		mlist.add(temp);
			 		temp = 0;
			 	}
			}
		}
		for(int i : mlist){
			if(i%2==0) min+=i/2;
			else min+=((i/2)+1);
		}
		System.out.println(min+" "+max);
		in.close();
	}

}

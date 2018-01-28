package HackerRank_Hiring_Contest;

import java.util.Scanner;

public class Programming_Competition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String temp = "";
        int diff = 0;
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int d = in.nextInt();
            int j = in.nextInt();
            if(j-d > diff){
            	diff = j-d;
            	temp = name;
            }
        }
        System.out.println(temp+" "+diff);
        in.close();
	}
}

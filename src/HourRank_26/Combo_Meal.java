package HourRank_26;

import java.util.Scanner;

public class Combo_Meal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int b = in.nextInt();
            int s = in.nextInt();
            int c = in.nextInt();
            
            int a1 = c-s;
            int x = b-a1;
            System.out.println(x);
            
        }
        in.close();
	}

}

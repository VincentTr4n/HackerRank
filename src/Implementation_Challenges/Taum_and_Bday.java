package Implementation_Challenges;
import java.util.*;

public class Taum_and_Bday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long B = in.nextLong();
            long W = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            long b = y+z<x?y+z:x;
            long w = x+z<y?x+z:y;
            System.out.println(B*b+W*w);
            
        }
		
		in.close();
	}

}

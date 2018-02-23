package Week_of_Code_36;

import java.util.Scanner;

public class Acid_Naming {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int l = name.length();
            if(l>=7 && name.substring(0,5).equals("hydro") &&  name.substring(l-2,l).equals("ic")) System.out.println("non-metal acid");
            else if(l>=2 && name.substring(l-2,l).equals("ic")) System.out.println("polyatomic acid");
            else System.out.println("not an acid");
        }
        in.close();
	}

}

package STRING;

import java.util.Scanner;

public class Funny_String {

	public static String funnyString(String s){
		boolean ok = true;
        String r = new StringBuilder(s).reverse().toString();
        for(int i=1;i<s.length();i++){
        	if(Math.abs(s.charAt(i-1)-s.charAt(i))!=Math.abs(r.charAt(i-1)-r.charAt(i))){
        		ok = false; break;
        	}
        }
		return ok?"Funny":"Not Funny";
    }

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
        in.close();
	}

}

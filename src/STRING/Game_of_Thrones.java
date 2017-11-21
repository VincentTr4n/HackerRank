package STRING;
import java.util.*;

public class Game_of_Thrones {
	
	static String gameOfThrones(String s){
		char []c = new char[123];
		char [] arr = s.toCharArray();
		for(char i : arr) c[i]++;
		int count = 0;
		for(int i=97;i<=122;i++){
			if(c[i]%2!=0) count++;
		}
		if(count==1 || count==0) return "YES";
		return "NO";
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
        in.close();
	}
}

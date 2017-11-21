package Implementation_Challenges;
import java.math.BigInteger;
import java.util.*;

public class Extr_Long_Factorials {
	
	public static void main(String[] args) {
		BigInteger ans = new BigInteger("1"); 
		for(int i =(new Scanner(System.in).nextInt());i>1;i--) ans=ans.multiply(BigInteger.valueOf(i));
		System.out.println(ans);
	}

}

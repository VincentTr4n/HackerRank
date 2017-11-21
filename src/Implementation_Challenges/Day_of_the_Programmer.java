package Implementation_Challenges;
import java.util.*;

public class Day_of_the_Programmer {
	public static void main(String[] args) {
		int year = new Scanner(System.in).nextInt();
		System.out.println(new String((year==1918?26:((year<=1917 && year%4==0)?12:(1918 < year && (year%400 ==0 || (year%4==0 && !(year%100 == 0))))?12:13))+".09."+year));
	}
}

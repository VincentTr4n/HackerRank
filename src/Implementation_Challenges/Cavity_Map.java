package Implementation_Challenges;
import java.util.*;

public class Cavity_Map {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][]a = new int[n][n];
		for(int i=0;i<n;i++){
			String temp = in.next();
			for(int j=0;j<n;j++){
				a[i][j] = temp.charAt(j) - '0';
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>=1 && j>=1 && i<n-1 && j<n-1){
					if(a[i][j]>a[i+1][j] && a[i][j]>a[i-1][j] && a[i][j]>a[i][j+1] && a[i][j]>a[i][j-1])
						System.out.print("X");
					else System.out.print(a[i][j]);
				}else System.out.print(a[i][j]);
			}
			System.out.println();
		}
			
		in.close();
	}
}

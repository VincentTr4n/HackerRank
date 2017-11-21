package Search;
import java.util.*;

import ReadIput.ReadInfor;

public class TEST_TXT {
	public static void main(String[] args) {
		ReadInfor r = new ReadInfor();
		ArrayList<String> list = r.readf("temp1.txt");
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(list.get(0)); //in.nextInt();
		int []a = new int[n];
		String [] s1 = list.get(1).split(" ");
		for(int i=0;i<n;i++) a[i] = Integer.parseInt(s1[i]); //in.nextInt();
		int m = Integer.parseInt(list.get(2));//in.nextInt();
		int []b = new int[m];
		String [] s2 = list.get(3).split(" ");
		for(int i=0;i<m;i++) b[i] = Integer.parseInt(s2[i]); //in.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		int []check = new int[200005];
		int []c = new int[m+1];
		for(int i=0;i<n;i++) c[i] = a[i];
		for(int i=0;i<m;i++)
		{
			if(c[i]-b[i]!=0){
				n++;
				if(n<=m){
					for(int j=n-1;j>=i+1;j--)
					{
						c[j]=c[j-1];	
					}
					c[i] = b[i];
					check[b[i]]++;
					if(check[b[i]]==1) System.out.print(b[i]+" ");
				}
				else break;
			}
			//for(int t:a) System.out.print(t+" ");
			//System.out.println();
		}
		in.close();
	}
}

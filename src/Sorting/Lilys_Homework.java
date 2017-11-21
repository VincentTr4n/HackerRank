package Sorting;
import java.util.*;

public class Lilys_Homework {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []a = new int[n];
		int []index = new int[2000005];
		int []temp = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
			temp[i] = a[i];
		}
		Arrays.sort(temp);
		for(int i=0;i<n;i++){
			index[a[i]]=i;
		}
//		System.out.println();
//		for(int i:temp) System.out.println(i+" ");
		int count=0;
		for(int i=0;i<n;i++){
			if(a[i]!=temp[i]){
				count++;
				int t = a[i];
				a[i] = a[index[temp[i]]];
				a[index[temp[i]]] = t;
				index[t] = index[temp[i]];
				index[temp[i]] = i;
				
			}
		}
		
		System.out.println(count);
		in.close();
	}

}

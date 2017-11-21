package Sorting;
import java.util.*;

public class QuickSort {
	
	public static List<Integer> QS(List<Integer> a){
		List<Integer> l = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		List<Integer> e = new ArrayList<>();
		int p = a.get(0);
		for(int i : a){
			if(i<p) l.add(i);
			else if(i>p) r.add(i);
			else e.add(i);
		}
		if(l.size()>1) l = QS(l);
		if(r.size()>1) r = QS(r);
		l.addAll(e);
		l.addAll(r);
		for(int i : l) System.out.print(i+" ");
		System.out.println();
		return l;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i=0;i<n;i++) a.add(in.nextInt());
		QS(a);
		in.close();
	}
}

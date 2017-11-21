package Greedy;

import java.util.*;

class Order{
	public int total;
	public int index;
}
class Checker implements Comparator<Order> {

	@Override
	public int compare(Order a, Order b) {
		if(a.total<b.total) return -1;
		else if(a.total>b.total) return 1;
		else return 0;
	}
}


class Jim_and_the_Orders {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Order> list = new ArrayList<Order>();
		for(int i=0;i<n;i++)
		{
			Order temp = new Order();
			int t= in.nextInt(); int d = in.nextInt();
			temp.total = t+d;
			temp.index = i+1;
			list.add(temp);
		}
		Collections.sort(list, new Checker());
		for(int i=0;i<n;i++)
			System.out.print(list.get(i).index+" ");
		in.close();
	}
}

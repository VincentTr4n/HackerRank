package Sorting_Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//Input:
//5					
//amy 100						
//david 100			
//heraldo 50			
//aakansha 75			
//aleksa 150	
//output:
//aleksa 150			
//amy 100			
//david 100
//aakansha 75
//heraldo 50
class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		if(a.score>b.score) return -1;
		else if(a.score<b.score) return 1;
		else return a.name.compareTo(b.name);
	}

}
class SolutionMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Player[] player = new Player[n];
		Checker checker = new Checker();
		for (int i = 0; i < n; i++) {
			player[i] = new Player(in.next(), in.nextInt());
		}
		Arrays.sort(player,checker);
		for (int i = 0; i < player.length; i++) {
			System.out.println(player[i].name + " " + player[i].score);
		}
		in.close();

	}
}


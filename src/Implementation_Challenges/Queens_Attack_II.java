package Implementation_Challenges;

import java.util.Scanner;

public class Queens_Attack_II {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int rq = in.nextInt();
		int cq = in.nextInt();
		int above = n - rq;
		int below = rq - 1;
		int right = n - cq;
		int left = cq - 1;
		int up_right = n - Math.max(rq, cq);
		int down_right = Math.min(n - cq, rq - 1);
		int up_left = Math.min(n - rq, Math.abs(1 - cq));
		int down_left = Math.min(rq, cq) - 1;
		for (int i = 0; i < k; i++) {
			int ro = in.nextInt();
			int co = in.nextInt();
			if (ro == rq) {
				if (cq < co) right = co - cq < right ? co - cq - 1 : right;
				else left = cq - co < left ? cq - co - 1 : left;
			} else if (co == cq) {
				if (rq < ro) above = ro - rq < above ? ro - rq - 1 : above;
				else below = rq - ro < below ? rq - ro - 1 : below;
			} else if ((ro > rq && co > cq) && (ro - rq == co - cq) && ro - rq < up_right)
				up_right = ro - rq - 1;
			else if ((ro < rq && co < cq) && (rq - ro == cq - co) && rq - ro < down_left)
				down_left = rq - ro - 1;
			else if ((ro < rq && co > cq) && (rq - ro == co - cq) && rq - ro < down_right)
				down_right = rq - ro - 1;
			else if ((ro > rq && co < cq) && (ro - rq == cq - co) && ro - rq < up_left)
				up_left = ro - rq - 1;
		}
		int res = above+below+left+right+up_left+up_right+down_left+down_right;
		System.out.println(res);
		in.close();
	}

}

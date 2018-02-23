package Week_of_Code_36;

import java.util.Scanner;

public class Ways_to_give_a_check {
	public static int juntK(int i,char[][] board){
		int res= 0;
		if(i-2>=0 && board[1][i-2]=='k') res++;
		if(i-1>=0 && board[2][i-1]=='k') res++;
		if(i+2<=7 && board[1][i+2]=='k') res++;
		if(i+1<=7 && board[2][i+1]=='k') res++;
		return res;
	}
	public static int juntQ(int i,char[][] board){
		int res = 0;
		for(int j=0;j<8;j++) if(board[j][i]=='k') res++;
		for(int j=0;j<8;j++) if(board[0][j]=='k') res++;
		for(int j=i-1,r=1;j>0;j--) if(board[r++][j]=='k') res++;
		for(int j=i+1,r=1;j<8;j++) if(board[r++][j]=='k') res++;
		return res;
	}
	public static int juntR(int i,char[][] board){
		int res = 0;
		for(int j=0;j<8;j++) if(board[j][i]=='k') res++;
		for(int j=0;j<8;j++) if(board[0][j]=='k') res++;
		return res;
	}
	public static int juntB(int i,char[][] board){
		int res = 0;
		for(int j=i-1,r=1;j>0;j--) if(board[r++][j]=='k') res++;
		for(int j=i+1,r=1;j<8;j++) if(board[r++][j]=='k') res++;
		return res;
	}
	public static int juntP(int i,char[][] board){
		int res=0;
		for(int j=0;j<8;j++){
         	if(board[0][j]=='k'){
         		if(i>0 && i+1==j) res++;
         		if(i<8 && i-1==j) res++;
          	}
         }
		return res;
	}
	public static boolean CheckPos(char[][]board){
		int rq=0,cq=0;
		 for(int i=0;i<8;i++)
         	for(int j=0;j<8;j++) if(board[i][j]=='k'){rq=i; cq=j;}
		 for(int i=0;i<8;i++)
	         	for(int j=0;j<8;j++){
	         		int ro=i,co=j;
	         		int above = 8 - rq;
	        		int below = rq - 1;
	        		int right = 8 - cq;
	        		int left = cq - 1;
	         		int up_right = 8 - Math.max(rq, cq);
	        		int down_right = Math.min(8 - cq, rq - 1);
	        		int up_left = Math.min(8 - rq, Math.abs(1 - cq));
	        		int down_left = Math.min(rq, cq) - 1;
	         		if(board[i][j]=='Q'){
	         			if (ro == rq) {
	        				if (cq < co && co - cq < right) return true;
	        				else if(cq - co < left) return true;
	        			} else if (co == cq) {
	        				if (rq < ro && ro - rq < above) return true;
	        				else if(rq - ro < below) return true;
	        			} else if ((i > rq && j > cq) && (i - rq == j - cq) && i - rq < up_right)
	         				return true;
	         			else if ((ro < rq && co < cq) && (rq - ro == cq - co) && rq - ro < down_left)
	         				return true;
	        			else if ((ro < rq && co > cq) && (rq - ro == co - cq) && rq - ro < down_right)
	        				return true;
	        			else if ((ro > rq && co < cq) && (ro - rq == cq - co) && ro - rq < up_left)
	        				return true;
	         		}
	         		else if(board[i][j]=='B'){
	         			if ((i > rq && j > cq) && (i - rq == j - cq) && i - rq < up_right)
	         				return true;
	         			else if ((ro < rq && co < cq) && (rq - ro == cq - co) && rq - ro < down_left)
	         				return true;
	        			else if ((ro < rq && co > cq) && (rq - ro == co - cq) && rq - ro < down_right)
	        				return true;
	        			else if ((ro > rq && co < cq) && (ro - rq == cq - co) && ro - rq < up_left)
	        				return true;
	         		}
	         		else if(board[i][j]=='K'){
	         			if (ro == rq) {
	        				if (cq < co && co - cq < right) return true;
	        				else if(cq - co < left) return true;
	        			} else if (co == cq) {
	        				if (rq < ro && ro - rq < above) return true;
	        				else if(rq - ro < below) return true;
	         		}
	         		}
	         	}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	char[][] board = new char[8][8];
            for(int i=0;i<8;i++)
            {
            	String temp = in.next();
            	for(int j=0;j<8;j++) board[i][j] = temp.charAt(j);
            }
            int res = 0;
            for(int i=0;i<8;i++){
            	if(board[1][i]=='P'){
            		if(juntK(i, board)>0) res++;
            		if(juntQ(i, board)>0) res++;
            		if(juntB(i, board)>0) res++;
            		if(juntR(i, board)>0) res++;
            		if(juntP(i, board)>0) res++;
            	}
            }
            boolean ok = false;
            for(int i=0;i<8;i++) if(board[1][i]=='k') ok = true;
            if(ok) for(int i=0;i<8;i++) if(board[1][i]=='Q' || board[1][i]=='R') res+=4;
            System.out.println(res);
        }
        in.close();
	}
}

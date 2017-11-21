package Implementation_Challenges;
import java.util.*;

public class Modified_Kaprekar_Numbers {
	private static String[] splitAt(String str, int idx){
        String[] ans = new String[2];
        ans[0] = str.substring(0, idx);
        if(ans[0].equals("")) ans[0] = "0"; //parsing "" throws an exception
        ans[1] = str.substring(idx);
        return ans;
    }
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        boolean ok = true;
        int base = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        for(long i = p; i <= q; i++){
            String sqrStr = Long.toString(i * i, base);
            for(int j = 0; j < sqrStr.length() / 2 + 1; j++){
                String[] parts = splitAt(sqrStr, j);
                long firstNum = Long.parseLong(parts[0], base);
                long secNum = Long.parseLong(parts[1], base);
                if(secNum == 0) break;
                if(firstNum + secNum == i){
                    System.out.print(i+" ");
                    ok = false;
                    break;
                }
            }
        }
        if(ok)  System.out.print("INVALID RANGE");
        in.close();
    }
}

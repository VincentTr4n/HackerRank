package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int min = Math.abs(a[n-1]-a[n-2]);
        for(int i=n-1;i>=1;i--){
        	if(Math.abs(a[i]-a[i-1])<min) min = Math.abs(a[i]-a[i-1]);
        }
        System.out.println(min);
        in.close();
    }
}


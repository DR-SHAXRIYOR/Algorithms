package week1;

import java.util.Scanner;

public class Measuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long now = System.currentTimeMillis();
         System.out.println(now);
        int[] a = new int[100];
        int ind = 0;
        while(sc.hasNextInt()) {
            a[ind] = sc.nextInt();
            ind++;
        }
        System.out.println(System.currentTimeMillis());
        sc.close();
    }
}
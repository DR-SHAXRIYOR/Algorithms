package week2;

import java.util.Scanner;
import week2.Shuffle;

public class ShuffleClient {
  
  public static void main(String[] args) {
    Shuffle sh = new Shuffle();  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Comparable b[] = sh.shuffle(a);
    System.out.println("Result:");
    for (int i = 0; i < n; i++) {
      System.out.print(b[i] + " ");
    }
  }

}
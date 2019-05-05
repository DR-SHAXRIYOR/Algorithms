package week3;

import java.util.Scanner;

public class QuickSortClient {
  
  
  public static void main(String[] args) {
    QuickSort qs = new QuickSort();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    qs.sort(a);

    System.out.println("Result:");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + ", ");
    }
  }
}
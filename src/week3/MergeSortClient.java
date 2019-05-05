package week3;

import java.util.Scanner;

public class MergeSortClient {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MergeSort ms = new MergeSort();
    int n = sc.nextInt();
    Integer[] a  = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    ms.sort(a);
    System.out.println("Result:");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
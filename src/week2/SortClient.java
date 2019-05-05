package week2;

import java.util.Scanner;

public class SortClient {
  
  public static void main(String[] args) {
    SelectionSort ss = new SelectionSort();  
    InsertionSort is = new InsertionSort();  
    ShellSort shs = new ShellSort();  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int b[] = ss.sort(a);
    int ib[] = is.sort(a);
    int shb[] = shs.sort(a);
    System.out.println("Result:");
    for (int i = 0; i < n; i++) {
      System.out.print(shb[i] + " ");
    }
  }

}
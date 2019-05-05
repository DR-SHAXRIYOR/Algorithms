package week1;

import java.util.Scanner;

public class ThreeSum {

  public static int count(int[] a) {
    int n = a.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (a[i] + a[j] + a[k] == 0) {
            count++;
          }
        }
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int m = 0;
    m = sc.nextInt();
    int a[] = new int[m];
    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
    }
    int result = count(a);
    System.out.println("Result:" + result);
    sc.close();
  }

}
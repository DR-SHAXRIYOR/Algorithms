package week1;
import java.util.Scanner;

/**
 * This algorithm works only for sorted arrays
 * Complexity of this algorithm is: 1 + lgN
 * @param a an array of sorted ints
 * @param key a searching element from array a 
 */
public class BinarySearch {
  public static int binarySearch(int[] a, int key) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int key = sc.nextInt();
    int result = binarySearch(a, key);
    System.out.println("Result:" + result);
    sc.close();
  }
  
}
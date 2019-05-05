package week2;

public class ShellSort {

  private boolean less(int a, int b) {
    return a < b ? true : false;
  }
  public int[] sort(int[] a) {
    int n = a.length;
    int h = 1;
    while (h < n/3) h = 3 * h + 1;
    while(h >= 1) {
        for (int i = h; i < n; i++) {
          for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
            int swap = a[j];
            a[j] = a[j-h];
            a[j-h] = swap;
          }
        }
        h = h / 3;
    }
    return a;
  }
}
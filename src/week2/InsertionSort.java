package week2;

public class InsertionSort {

  public int[] sort(int[] a) {
    int n = a.length;

    for (int i = 0; i < n; i++) {
      for (int j = i; j > 0; j--) {
        if (a[i] < a[j]) {
          int swap = a[i];
          a[i] = a[j];
          a[j] = swap;
        }
      }
    }
    return a;
  }
}
package week3;

import week2.Shuffle;

public class QuickSort {

  private static int partition(Comparable[] a, int lo, int hi) {
    int i = lo, j = hi + 1;
    while (true) {
      while (less(a[++i], a[lo]))
        if (i == hi) break;
      while (less(a[lo], a[--j]))
        if (j == lo) break;
      
      if (i >= j) break;
      swap(a, i, j);
    }
    swap(a, lo, j);
    return j;
  }

  public static void sort(Comparable[] a) {
    Shuffle shf = new Shuffle();
    shf.shuffle(a);
    sort(a, 0, a.length - 1);
  }

  private static void sort(Comparable[] a, int lo, int hi) {
    //TODO use insertion sort here
    if (hi <= lo) return;
    int j = partition(a, lo, hi);
    sort(a, lo, j - 1);
    sort(a, j + 1, hi);
  }

  private static void swap(Comparable[] a, int i, int j) {
    Comparable swap = a[i];
    a[i] = a[j];
    a[j] = swap;  
  }

  private static boolean less(Comparable v, Comparable w) {
    if (v == w) return false;   // optimization when reference equals
      return v.compareTo(w) < 0;
  }

}
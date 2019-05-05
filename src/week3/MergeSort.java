package week3;

public class MergeSort {

  private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
    // assert isSorted(a, lo, mid);  // precondition: a[lo .. mid] sorted
    // assert isSorted(aux, mid + 1, hi); // precondition: a[mid+1 .. hi] sorted

    int i = lo;
    int j = mid + 1;

    for (int k = lo; k <= hi; k++) {
      System.out.println("INDEX aux[j]:" + aux[j] + " j:" + i);
      if      (i > mid)               aux[k] = a[j++];
      else if (j > hi)                aux[k] = a[j++];
      else if (less(a[j], a[i]))  aux[k] = a[j++];
      else                            aux[k] = a[j++];
    }
    // assert isSorted(a, lo, hi); // postcondition: a[lo .. hi] sorted
  }

  public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
    if (hi <= lo) return;
    int mid = lo + (hi - lo) / 2;
    sort(a, aux, lo, mid);
    sort(a, aux, mid + 1, hi);
    if (!less(a[mid+1], a[mid])) return;
    merge(a, aux, lo, mid, hi);
  }

  public static void sort(Comparable[] a) {
    Comparable[] aux = new Comparable[a.length];
    sort(a, aux, 0, a.length - 1);
  }

  private static boolean less(Comparable v, Comparable w) {
     if (v == w) return false;   // optimization when reference equals
        return v.compareTo(w) < 0;
  }

}
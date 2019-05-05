package week2;

public class SelectionSort {

  public int[] sort(int[] a) {
    int n = a.length;

    for (int i = 0; i < n; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++)
        if (a[j] < a[min])
          min = j;
      
      int swap = a[min];
      a[min] = a[i];
      a[i] = swap;
    }
    return a;
  }
}
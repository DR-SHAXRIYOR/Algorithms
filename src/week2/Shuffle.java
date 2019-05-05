package week2;

import java.util.Random;

public class Shuffle {

  public Comparable[] shuffle(Comparable[] a) {
    
    int n = a.length;
    for (int i = 0; i < n; i++) {
      int r = new Random().nextInt(i + 1);
      Comparable swap = a[i];
      a[i] = a[r];
      a[r] = swap;
    }

    return a;
  }
}
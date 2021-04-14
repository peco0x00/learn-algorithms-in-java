package org.vny.literature.alg4.chapter02;

public class Main {

  private void selectionSort(char[] a) {
    System.out.printf("%5s%5s", "i", "min");
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%5d", i);
    }
    System.out.println();
    System.out.printf("%5s%5s", " ", " ");
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%5c", a[i]);
    }
    System.out.println();
    for (int i = 1; i < a.length; i++) {
      char key = a[i];
      int j = i - 1;
      while (j > 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
      out(i, j, a);
    }
  }

  private void out(int i, int min, char[] a) {
    System.out.printf("%5d%5d", i, min);
    for (char c : a) {
      System.out.printf("%5c", c);
    }
    System.out.println();
  }

  private void swap(char[] a, int i, int j) {
    char tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  public static void main(String[] args) {
    Main main = new Main();
    // char[] a = "EASYQUESTION".toCharArray();
    char[] a = "SORTEXAMPLE".toCharArray();
    main.selectionSort(a);
  }
}

package org.vny.algorithms.sort;

public class ShellSort implements Sort {

  @Override
  public void sort(int[] array) {
    int j;
    // decrease gap by / 2
    for (int gap = array.length / 2; gap > 0; gap /= 2) {
      // insertion sort
      for (int i = gap; i < array.length; i++) {
        int key = array[i];
        for (j = i; j >= gap && key < array[j - gap]; j -= gap) {
          array[j] = array[j - gap];
        }
        array[j] = key;
      }
    }
  }
}

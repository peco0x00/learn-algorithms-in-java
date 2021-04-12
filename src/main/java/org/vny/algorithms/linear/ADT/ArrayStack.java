package org.vny.algorithms.linear.ADT;

public class ArrayStack {

  private int[] array;
  private int top;

  public ArrayStack() {
    this(10);
  }

  public ArrayStack(int size) {
    array = new int[size];
    top = 0;    // top refer to the last element's next position
  }

  public boolean isFull() {
    return top == array.length;
  }

  public boolean isEmpty() {
    return top == 0;
  }

  public void push(int val) {
    array[top++] = val;
  }

  public int pop() {
    return array[--top];
  }

  public int peek() {
    return array[top - 1];
  }

  public void print() {
    for (int i = 0; i < top; i++) {
      System.out.print(array[i]);
      if (i < top - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }
}

package org.vny.algorithms.linear.ADT;

public class ArrayDeque {

  private int[] array;
  private int front;
  private int rear;

  public ArrayDeque() {
    this(10);
  }

  public ArrayDeque(int size) {
    array = new int[size + 1];
    front = rear = 0;
  }

  private int moveForward(int i) {
    return (i + 1) % array.length;
  }

  private int moveBackward(int i) {
    return (i - 1 + array.length) % array.length;
  }

  public boolean isEmpty() {
    return front == rear;
  }

  public boolean isFull() {
    return front == (rear + 1) % array.length;
  }

  public int size() {
    return (rear - front + array.length) % array.length;
  }

  public void addFirst(int x) {
    if (isFull()) return;
    array[front] = x;
    front = (front - 1 + array.length) % array.length;
  }

  public void addLast(int x) {
    if (isFull()) return;
    rear = (rear + 1) % array.length;
    array[rear] = x;
  }

  public int removeFirst() {
    if (isEmpty()) return -1;
    front = (front + 1) % array.length;
    return array[front];
  }

  public int removeLast() {
    if (isEmpty()) return -1;
    int res = array[rear];
    rear = (rear - 1 + array.length) % array.length;
    return res;
  }

  public int peekFirst() {
    if (isEmpty()) return -1;
    return array[(front + 1) % array.length];
  }

  public int peekLast() {
    if (isEmpty()) return -1;
    return array[rear];
  }

  public void print() {
    if (isEmpty()) return;
    int n = size();
    for (int i = 0; i < n; i++) {
      System.out.print(array[(i + front + 1) % array.length]);
      if (i < n - 1) System.out.print(" ");
    }
    System.out.println();
  }
}
